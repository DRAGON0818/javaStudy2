package com.dlx.charater02;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Box{
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}

public class StreamD {

    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.println(title + ":");

        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) System.out.println(", ");
            if (i < SIZE) System.out.println(firstElements.get(i));
            else System.out.println("...");
        }
        System.out.println();
    }

    public static Stream<String> letters(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            result.add(s.substring(i,i+1));
        return result.stream();
    }

    public static void main(String[] args) throws IOException {

        Logger.getGlobal().info("File->Open menu item selected");

        Path path = Paths.get("alice.txt");
        String contents = new String(Files.readAllBytes(path));

        Stream<String> words = Stream.of(contents.split("\\PL+"));
        show("words", words);

        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        show("song", song);

        Stream silence = Stream.empty();
        show("silence", silence);

        Stream<String> echo = Stream.generate(() -> "Echo");
        show("Echo", echo);

        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms", randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ZERO));
        show("integers", integers);

        Stream<String> wordAnotherWay = Pattern.compile("\\PL+").splitAsStream(contents);//Pattern中通过正则表达式来分割一个字符串
        show("WordsAnotherWay", wordAnotherWay);

        //Files.lines 返回一个文件夹中所有行的stream
        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            show("lines", lines);
        }

        List<String> optional = Arrays.asList(contents.split("\\PL+"));
        Optional<String> first = optional.parallelStream().limit(3).parallel().filter(s -> s.contains("T")).findAny();
        System.out.println(first.orElse("ssss"));

        Stream.iterate(1.0, p -> p * 2).peek(e -> System.out.println("Fetching " + e)).limit(20).toArray();

        List<String> word=new ArrayList<>();
        word.add("boat");
        Stream<Stream<String>> wordStream = word.stream().map(s -> letters(s));
        Stream<String> stringStream = word.stream().flatMap(s -> letters(s));
        List<Stream<String>> collect = wordStream.collect(Collectors.toList());
        List<String> collect1 = stringStream.collect(Collectors.toList());
        collect.forEach(c-> System.out.println(c));
        collect1.forEach(c-> System.out.println(c));

        Box box=new Box();
        box.setObject(Integer.valueOf(124));
        System.out.println(box.getObject());
        box.setObject("ssdf");
        System.out.println(box.getObject());

        int x=2;
        assert x>3;
    }
}


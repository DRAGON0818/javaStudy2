package com.dlx.charater02;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTest {
    private String s;
    public FunctionTest(){}

    public FunctionTest(String s){
        this.s=s;
    }

    public String getS(){
        return this.s;
    }

    public static void main(String[] args) {
        new FunctionTest("99999").testf(FunctionTest::sayTest1);

        Function<String , Integer> s=null;

        Consumer<String> consumer1 = (x) -> System.out.print(x);
        Consumer<String> consumer2 = (x) -> {
            System.out.println(" after consumer 1");
        };
        consumer1.andThen(consumer2).accept("test consumer1");

        Supplier<String> supplier1 = () -> "Test supplier";
        System.out.println(supplier1.get());

        //标准格式
        Supplier<Integer> supplier2 = () -> {
            return 20;
        };
        System.out.println(supplier2.get() instanceof Integer);

    }

    public void testf(Consumer<? super FunctionTest> handle){
        handle.accept(this);
    }

    public void sayTest(){
        System.out.println(this.getS());
    }

    public void sayTest1(){
        System.out.println(this.getS()+"1");
    }
}

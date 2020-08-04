package com.dlx;

import java.io.File;
import java.util.Scanner;

public class FileRename {
    public static void main(String[] args) {
        Scanner filePath = new Scanner(System.in);
        File f = new File(filePath.nextLine());
        if(f.isDirectory()){
            String directoryName = f.getName();
            System.out.println(directoryName);
            System.out.println(f.getAbsolutePath());
            renameFile(f.getAbsolutePath());
        }
        else
        {
            System.exit(1);
        }
    }


    public static void renameFile(String directoryPath) throws NullPointerException
    {
        try {
            File f = new File(directoryPath);
            File[] files = f.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    boolean b = file.renameTo(new File("C:\\Users\\donglxa\\Desktop\\新建文件夹\\1.txt"));
                }
            }
        }catch (NullPointerException e){
            throw e;
        }
    }
}

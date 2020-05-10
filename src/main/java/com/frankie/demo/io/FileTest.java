package com.frankie.demo.io;

import java.io.*;
import java.util.Scanner;

/**
 * @author: Yao Frankie
 * @date: 2020/4/28 10:15
 */
public class FileTest {

    public static String absolutePath = "C:\\Users\\15900\\Desktop\\E-Books";

    public static void main(String[] args) throws IOException {
//        printAbsolutePath();
//        listAll();
//        createAndWriteFile();
//        readFile();
//        getFileInfo();
        File dir = new File("src/main/resources/root");
        listAllFilesRecursively(dir);
    }

    private static void listAllFilesRecursively(File dir) {
        if (dir == null || !dir.exists()){
            return;
        }
        if (dir.isFile()){
            System.out.println(dir.getName());
            return;
        }
        for (File file: dir.listFiles()){
            listAllFilesRecursively(file);
        }
    }

    public static void printAbsolutePath(){
        String absolutePath = System.getProperty("user.dir");
        System.out.println(absolutePath);
        // D:\Playground\improve-java
    }

    public static void listAll(){

        File file = new File(absolutePath);
        String[] list = file.list();
        assert list != null;
        for(String s: list){
            File curFile = new File(absolutePath + "/" + s);
            System.out.println(s + ": " + curFile.isDirectory());
        }
    }

    public static void createAndWriteFile() throws IOException {
        FileWriter bookFile = new FileWriter(absolutePath + "/books.txt", true);
        // 覆盖式
//        bookFile.write("Java Books.\nJava Books. ");
        // 如何追加内容(FileWriter构造器)
        bookFile.write("\n Multi-threads.");
        bookFile.close();
    }

    public static void readFile() throws IOException {
        File bookFile = new File(absolutePath + "/books.txt");
        Scanner scanner = new Scanner(bookFile);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
    public static void getFileInfo(){
        File bookFile = new File(absolutePath + "/books.txt");
        if (bookFile.exists()){
            System.out.println("File name: " + bookFile.getName());
            System.out.println("File size: " + bookFile.length());
            System.out.println("File readable: " + bookFile.canRead());
            System.out.println("File writeable: " + bookFile.canWrite());
            System.out.println("File executable: " + bookFile.canExecute());
            System.out.println("File absolute path: " + bookFile.getAbsolutePath());

        } else {
            System.out.println("The file does not exist.");
        }
    }
}

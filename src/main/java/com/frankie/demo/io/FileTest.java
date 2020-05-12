package com.frankie.demo.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author: Yao Frankie
 * @date: 2020/4/28 10:15
 */
public class FileTest {

    public static String absolutePath = "C:\\Users\\15900\\Desktop\\E-Books";

    public static void main(String[] args) throws IOException {
//        printRelatedPath();
        File dir = new File("src/main/resources/root");
        listAllFilesRecursively(dir);
//        filerFileRecursively(dir);
//        fileListFilesTest();
    }

    private static void fileListFilesTest() {
        File file = new File("src/main/resources/root/level1_1/level2_a.txt");
        File[] files = file.listFiles(); // null
    }

    private static void filerFileRecursively(File dir) {

        if (dir == null || !dir.exists()){
            return;
        }

        if (dir.isFile()){
            boolean endWithJava = dir.getName().endsWith(".java");
            if (endWithJava){
                System.out.println(dir.getName());
            }
            return;
        }
        Arrays.stream(Objects.requireNonNull(dir.listFiles()))
                .forEach(FileTest::filerFileRecursively);
    }

//    private static void filerFile(File dir) {
//        String[] nameList = dir.list((foundDir, name) -> name.endsWith(".java"));
//        Arrays.stream(nameList).forEach(System.out::println);
//    }

//    private static void listAllFilesRecursively(File dir) {
//        if (dir == null || !dir.exists()){
//            return;
//        }
//        if (dir.isFile()){
//            System.out.println(dir.getName());
//            return;
//        }
//        for (File file: dir.listFiles()){
//            listAllFilesRecursively(file);
//        }
//    }

    private static void listAllFilesRecursively(File dir) {
        if (dir == null || !dir.exists()){
            return;
        }
        if (dir.isFile()){
            System.out.println(dir.getName());
            return;
        }
        Arrays.stream(Objects.requireNonNull(dir.listFiles()))
                .forEach(FileTest::listAllFilesRecursively);
    }

    public static void printRelatedPath(){
        String related = System.getProperty("user.dir");
        System.out.println(related);
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

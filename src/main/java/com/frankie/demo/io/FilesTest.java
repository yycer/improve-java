package com.frankie.demo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 22:23
 */
public class FilesTest {

    public static Path writeAndReadPath = Paths.get("src/main/resources/playio/filesWriteAndRead.txt");
    public static Path rootPath = Paths.get("src/main/resources/root");
    public static String targetPath = "src/main/resources/playio/filesCopy.txt";



    public static void main(String[] args) throws IOException {
//        writeTest();
//        readTest();
//        copy();
        listFilesRecursively();
    }

    private static void listFilesRecursively() throws IOException {
        // Just traversal one layer.
        // Files.list(rootPath).forEach(System.out::println);
        Files.walkFileTree(rootPath, new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
                System.out.println(file);
                // file name
                if (file.endsWith("level2_d.java")){
                    System.out.println("bingo!");
                    return FileVisitResult.TERMINATE;
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs){
                System.out.println("正在访问: " + file);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private static void copy() throws IOException {
        Files.copy(writeAndReadPath, new FileOutputStream(targetPath));
    }

    private static void readTest() throws IOException {
        Files.lines(writeAndReadPath, StandardCharsets.UTF_8).forEach(System.out::println);
    }

    private static void writeTest() throws IOException {
        ArrayList<String> content = new ArrayList<>();
        content.add("当风轻借力");
        content.add("一举入高空");
        Files.write(writeAndReadPath, content, StandardCharsets.UTF_8);
    }
}

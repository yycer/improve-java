package com.frankie.demo.io;

import java.io.*;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 10:24
 */
public class FileOutputStreamTest {

    public static final String path      = "src/main/resources/playio/FileInputStreamTest.txt";
    public static final String newPath   = "src/main/resources/playio/copyPoem.txt";
    public static final String writePath = "src/main/resources/playio/poem.txt";


    public static void main(String[] args) {
//        copy();
        justWrite();
    }

    private static void justWrite() {
        try (FileWriter fw = new FileWriter(writePath)){
            fw.write("当风轻借力，\r\n");
            fw.write("一举入高空。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy() {
        try (
                FileInputStream  fis = new FileInputStream(path);
                FileOutputStream fos = new FileOutputStream(newPath);
        ){
            byte[] buf = new byte[64];
            int hasRead;
            while ((hasRead = fis.read(buf)) > 0){
                fos.write(buf, 0, hasRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

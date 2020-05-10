package com.frankie.demo.io;

import java.io.*;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 10:08
 */
public class FileInputStreamTest {

    public final static String path = "src/main/resources/playio/FileInputStreamTest.txt";

    public static void main(String[] args) throws IOException {
//        simpleRead();
        readOptimize();
        printStreamTest();
    }

    private static void printStreamTest() {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path))){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void readOptimize() {
        try (FileReader fr = new FileReader(path)){
            char[] buf = new char[64];
            int hasRead;
            while ((hasRead = fr.read(buf)) > 0){
                System.out.println(new String(buf, 0, hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void simpleRead() throws IOException {
        FileInputStream fis = new FileInputStream(path);
        byte[] buf = new byte[1024];
        int hasRead;
        while ((hasRead = fis.read(buf)) > 0){
            System.out.println(new String(buf, 0, hasRead));
        }
        fis.close();
    }
}

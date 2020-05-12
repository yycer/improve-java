package com.frankie.demo.io;

import java.io.*;

/**
 * @author: Yao Frankie
 * @date: 2020/5/10 12:54
 */
public class FlushTest {

    public final static String path = "src/main/resources/playio/flush.txt";
    public final static String manualPath = "src/main/resources/playio/manualFlush.txt";

    public static void main(String[] args) throws IOException {
//        usingAutoClosable();
//        usingManual();
//        justRead();
        playFlush();
    }

    private static void playFlush() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(manualPath));
        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(Math.random()));
            bw.newLine();
        }
        // bw.flush();
        // bw.close();
    }

    private static void justRead() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(manualPath));

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        br.close();
    }

    /**
     * flush()方法的作用，将缓存区的内容写入实际的物理节点。
     * close()方法中包含了flush()方法。
     * https://blog.csdn.net/bingo_1214/article/details/44919891
     * @throws IOException
     */
    private static void usingManual() throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(manualPath));
        BufferedReader br = new BufferedReader(new FileReader(manualPath));

        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(Math.random()));
            bw.newLine();
        }
//        bw.flush();

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        bw.close();
        br.close();
    }

    private static void usingAutoClosable() {
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(path));
                BufferedReader br = new BufferedReader(new FileReader(path))
        ) {

            for (int i = 0; i < 10; i++){
                bw.write(String.valueOf(Math.random()));
                bw.newLine();
            }
            bw.flush();

            String s;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.frankie.demo.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author: Yao Frankie
 * @date: 2020/5/13 22:02
 */
public class ChannelTest {

    public static final String sourcePath = "src/main/resources/playio/poem.txt";
    public static final String targetPath = "src/main/resources/playio/channelCopy.txt";

    public static void main(String[] args) throws IOException {
        copyUsingChannel();
    }

    private static void copyUsingChannel() throws IOException {
        FileInputStream fis = new FileInputStream(sourcePath);
        FileChannel inputChannel = fis.getChannel();
        FileOutputStream fos = new FileOutputStream(targetPath);
        FileChannel outputChannel = fos.getChannel();

        ByteBuffer bBuf = ByteBuffer.allocate(1024);

        while (true){
            int pos = inputChannel.read(bBuf);
            if (pos == -1){
                break;
            }
            bBuf.flip();
            outputChannel.write(bBuf);
            bBuf.clear();
        }

        fis.close();
        fos.close();
    }
}

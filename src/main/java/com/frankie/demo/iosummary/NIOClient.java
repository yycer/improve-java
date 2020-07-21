package com.frankie.demo.iosummary;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * @author: Yao Frankie
 * @date: 2020/7/21 09:08
 */
public class NIOClient {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入客户端编号: ");
        int id = in.nextInt();
        SocketChannel sc = SocketChannel.open();
        sc.connect(new InetSocketAddress("127.0.0.1", 9000));
        String s;
        while (true){
            if (!sc.finishConnect()){
                Thread.sleep(100);
                continue;
            }
            System.out.println("客户端" + id + "请输入要发送的内容: ");
            s = in.next();
            if (s.equalsIgnoreCase("quit")){
                break;
            }
            ByteBuffer bb = ByteBuffer.allocate(1024);
            byte[] bytes = (id + ":" + s).getBytes();
            bb.put(bytes);
            bb.flip();
            sc.write(bb);
        }
    }
}

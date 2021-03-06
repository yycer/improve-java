package com.frankie.demo.iosummary;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: Yao Frankie
 * @date: 2020/7/19 19:09
 */
public class BIOServer {

    private static final int port = 9000;
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            // 开始监听
            System.out.println("服务器开始监听，监听端口: " + port);
            while (true) {
                Socket socket = serverSocket.accept(); // 阻塞
                System.out.println("接受一个客户端的请求...");
                InputStream in = socket.getInputStream(); // 准备获取输入数据
                int len;
                byte[] buff = new byte[1024];
                while ((len = in.read(buff)) != -1) { // 阻塞
                    String s = new String(buff, 0, len);
                    System.out.println("读取到客户端输入的字符串: " + s);
                }
                in.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            serverSocket.close();
        }
    }
}

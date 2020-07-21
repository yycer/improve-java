package com.frankie.demo.iosummary;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author: Yao Frankie
 * @date: 2020/7/19 19:16
 */
public class BIOClient {
    private static final int port = 9000;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入客户端编号: ");
        int num = in.nextInt();
        Socket socket = null;

        try {
            socket = new Socket("127.0.0.1", port);
            System.out.println("客户端" + num + " 连接服务器成功！");
            OutputStream out = socket.getOutputStream();

            while (true){
                System.out.println("客户端" + num + " 请输入要发送的字符串(quit表示结束): ");
                String s = in.next();
                if (s.trim().equalsIgnoreCase("quit")){
                    break;
                }
                out.write((num + ":" + s).getBytes());
            }
            System.out.println("客户端" + num + " 连接中断");
            out.close();;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}

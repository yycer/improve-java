package com.frankie.demo.iosummary;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Yao Frankie
 * @date: 2020/7/21 09:03
 */
public class NIOServer1 {

    public static void main(String[] args) throws IOException {
        List<SocketChannel> list = new LinkedList<>();
        ServerSocketChannel ssc = null;
        try {
            // 创建ServerSocketChannel通道
            ssc = ServerSocketChannel.open();
            // 绑定端口
            ssc.socket().bind(new InetSocketAddress(9000));
            // 设置为非阻塞模式
            ssc.configureBlocking(false);
            System.out.println("开始监听...");
            while (true){
                Thread.sleep(1000);
                // 非阻塞，若没有客户端情况则返回null。
                SocketChannel sc = ssc.accept();
                System.out.println("SocketChannel: " + sc);
                if (sc != null) {
                    System.out.println("接受到请求...");
                    // 设置为非阻塞
                    sc.configureBlocking(false);
                    list.add(sc);
                    System.out.println("SocketChannel集合的数量: " + list.size());
                }
                for (SocketChannel channel: list){
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    // 非阻塞
                    int len = channel.read(buffer);
                    if (len > 0){
                        // flip()方法的作用是什么: 切换至读模式
                        // 将position设置为0, limit设置成写模式的position。
                        buffer.flip();
                        String s = new String(buffer.array(), 0, buffer.limit());
                        System.out.println("服务端接受到的数据: " + s);
                    }
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            ssc.close();
        }
    }
}

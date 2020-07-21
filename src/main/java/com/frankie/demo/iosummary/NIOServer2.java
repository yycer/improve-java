package com.frankie.demo.iosummary;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: Yao Frankie
 * @date: 2020/7/21 10:32
 */
public class NIOServer2 {

    public static void main(String[] args) throws IOException {

//
        ServerSocketChannel ssc = null;
        try {
            ssc = ServerSocketChannel.open();
            ssc.socket().bind(new InetSocketAddress(9000));
            ssc.configureBlocking(false);
            Selector s = Selector.open();
            ssc.register(s, SelectionKey.OP_ACCEPT);
            while (true){
                // 选择事件，会发生阻塞
                s.select();
                Set<SelectionKey> keys = s.selectedKeys();
                Iterator<SelectionKey> iterator = keys.iterator();
                while (iterator.hasNext()){
                    System.out.println("开始处理事件");
                    System.out.println("Size = " + keys.size());
                    SelectionKey next = iterator.next();
                    iterator.remove();
                    if (next.isReadable()){
                        System.out.println("读事件");
                        ByteBuffer b = ByteBuffer.allocate(1 << 10);
                        SocketChannel channel = (SocketChannel) next.channel();
                        int len = channel.read(b);
                        if (len > 0){
                            b.flip();
                            System.out.println(new String(b.array(), 0, len));
                        }
                    } else if (next.isWritable()) {
                        System.out.println("写事件");
                    } else if (next.isAcceptable()){
                        SocketChannel sc = ssc.accept();
                        sc.configureBlocking(false);
                        sc.register(s, SelectionKey.OP_READ);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            ssc.close();
        }
    }
}

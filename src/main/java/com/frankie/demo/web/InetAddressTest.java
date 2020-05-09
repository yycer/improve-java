package com.frankie.demo.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author: Yao Frankie
 * @date: 2020/5/9 22:15
 */
public class InetAddressTest {

    public static void main(String[] args) throws UnsupportedEncodingException {

        encoderTest();
    }

    private static void encoderTest() throws UnsupportedEncodingException {
        String encodeStr = URLEncoder.encode("姚屹晨", "UTF-8");
        System.out.println("encodeStr = " + encodeStr);

        String decodeStr = URLDecoder.decode(encodeStr, "UTF-8");
        System.out.println("decodeStr = " + decodeStr);
    }
}

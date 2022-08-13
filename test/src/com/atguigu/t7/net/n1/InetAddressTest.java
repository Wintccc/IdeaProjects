package com.atguigu.t7.net.n1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Wint
 * @create 2022-06-26 16:51
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress i1 = InetAddress.getByName("192.168.1.1");
            System.out.println(i1);
            InetAddress i2 = InetAddress.getByName("www.qq.com");
            System.out.println(i2);
            InetAddress i3 = InetAddress.getLocalHost();
            System.out.println(i3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }
}

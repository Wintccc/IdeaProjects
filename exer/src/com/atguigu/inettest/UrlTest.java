package com.atguigu.inettest;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Wint
 * @create 2022-06-04 23:08
 */
public class UrlTest {
    @Test
    public void test1() throws MalformedURLException {
        URL url = new URL("http:www.qq.com");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getQuery());
    }
}

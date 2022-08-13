package com.atguigu.t8.reflection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Wint
 * @create 2022-07-01 20:23
 */
public class ClassLoaderTest {

    @Test
    public void test1() throws Exception {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("src\\jdbc1.properties");
        properties.load(fis);

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        properties.load(is);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println(user);
        System.out.println(password);
    }
}

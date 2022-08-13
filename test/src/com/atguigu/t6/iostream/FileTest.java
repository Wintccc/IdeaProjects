package com.atguigu.t6.iostream;

import org.junit.Test;

import java.io.File;
import java.util.Arrays;

/**
 * @author Wint
 * @create 2022-06-24 15:10
 */
public class FileTest {
    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\IdeaProjects","test");
        File file3 = new File(file2,"hi.txt");
        System.out.println(file3.getName());
        System.out.println(file3.getPath());
        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getParent());
        System.out.println(file3.length());
        System.out.println(file3.lastModified());
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(file2.list()));
        System.out.println(file1.exists());
    }
}

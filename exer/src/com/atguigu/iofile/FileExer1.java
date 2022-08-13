package com.atguigu.iofile;

import org.junit.Test;

import java.io.File;

/**
 * @author Wint
 * @create 2022-06-01 19:39
 */
public class FileExer1 {
    //判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
    @Test
    public void test1(){
        File file = new File("D:\\Thinkpad 2K壁纸");
        String[] list = file.list();
        for(String str : list){
            if(str.endsWith(".jpg")){
                System.out.println(str);
            }
        }
    }
    @Test
    public void test2(){
        File srcFile = new File("D:\\Thinkpad 2K壁纸");
        File[] listFiles = srcFile.listFiles();
        for(File file : listFiles){
            if(file.getName().endsWith(".jpg")){
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}

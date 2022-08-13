package com.atguigu.stream;

import org.junit.Test;

import java.io.*;

/**
 * @author Wint
 * @create 2022-06-03 13:26
 */
public class StreamTest {
    @Test
    public void test4(){
        FileInputStream fis = null;
        try {
            File file1 = new File("dbcp.txt");
            fis = new FileInputStream(file1);
            byte[] b = new byte[3];
            int len;
            while ((len = fis.read(b)) != -1){
                String str = new String(b,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test3(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file1 = new File("dbcp.txt");
            File file2 = new File("dbcp1.txt");
            fr = new FileReader(file1);
            fw = new FileWriter(file2,false);
            char[] cbuf = new char[1024];
            int len;
            while((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fw != null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test2(){
        FileReader fr = null;
        try {
            //1.创建需要操作的File类
            File file = new File("dbcp.txt");
//            System.out.println(file.getAbsolutePath());
            //2.创建节点流/处理流
            fr = new FileReader(file);
            //3.使用流对文件进行操作
            char[] cbuf = new char[1024];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                for (int i = 0 ; i < len ; i++){
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test1(){
        FileReader fr = null;
        try {
            //1.创建需要操作的File类
            File file = new File("dbcp.txt");
//            System.out.println(file.getAbsolutePath());
            //2.创建节点流/处理流
            fr = new FileReader(file);
            //3.对文件进行操作
            int data = fr.read();
//            while(data != -1){
//                System.out.print((char)(data));
//                data = fr.read();
//            }
            while ((data = fr.read()) != -1){
                System.out.print((char)(data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null){
                    //4.关闭流
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

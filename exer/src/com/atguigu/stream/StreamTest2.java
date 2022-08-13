package com.atguigu.stream;

import org.junit.Test;

import java.io.*;

/**
 * @author Wint
 * @create 2022-06-03 14:29
 */
public class StreamTest2 {
    @Test
    public void test2(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file1 = new File("dbcp.txt");
            File file2 = new File("dbcp3.txt");
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            isr = new InputStreamReader(fis,"utf-8");
            osw = new OutputStreamWriter(fos,"gbk");
            char[] cbuf = new char[1024];
            int len;
            while((len = isr.read(cbuf)) != -1){
                osw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null){
                    isr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (osw != null){
                    osw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test1(){
        InputStreamReader isr = null;
        try {
            File file1 = new File("dbcp.txt");
            FileInputStream fis = new FileInputStream(file1);
            isr = new InputStreamReader(fis);
            char[] cbuf = new char[1024];
            int len;
            while((len = isr.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        try {
            if(isr != null){
                isr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

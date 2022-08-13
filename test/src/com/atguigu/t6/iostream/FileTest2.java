package com.atguigu.t6.iostream;

import org.junit.Test;

import java.io.*;

/**
 * @author Wint
 * @create 2022-06-25 13:15
 */
public class FileTest2 {
    @Test
    public void test1() {
        FileReader fr = null;
        try {
            File file = new File("dbcp.txt");
            fr = new FileReader(file);
            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File file1 = new File("dbcp.txt");
            File file2 = new File("dbcp1.txt");
            fr = new FileReader(file1);
            fw = new FileWriter(file2);
            int len;
            char[] cbuf = new char[5];
            while ((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() throws IOException {
        File fileSource = new File("photo.jpg");
        File fileDest = new File("photo1.jpg");
        FileInputStream fis = new FileInputStream(fileSource);
        FileOutputStream fos = new FileOutputStream(fileDest);
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }

    @Test
    public void test4() throws IOException{
        File file = new File("dbcp.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        int len;
        char[] cbuf = new char[5];
        while ((len = isr.read(cbuf)) != -1){
            for(int i = 0;i < len;i++){
                System.out.print(cbuf[i]);
            }
            //String str = new String(cbuf,0,len);
            //System.out.print(str);
        }

        isr.close();
    }
}

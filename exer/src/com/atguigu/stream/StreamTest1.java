package com.atguigu.stream;

import org.junit.Test;

import java.io.*;

/**
 * @author Wint
 * @create 2022-06-03 13:59
 */
public class StreamTest1 {
    @Test
    public void test3(){
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            FileReader fr = new FileReader("dbcp.txt");
            FileWriter fw = new FileWriter("dbcp2.txt");
            bfr = new BufferedReader(fr);
            bfw = new BufferedWriter(fw);
            char[] cbuf = new char[1024];
            int len;
            while((len = bfr.read(cbuf)) != -1){
                bfw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bfr != null){
                    bfr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bfw != null){
                    bfw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test2() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File fileSrc = new File("macos.jpeg");
            File fileDest = new File("macos2.jpeg");
            FileInputStream fis = new FileInputStream(fileSrc);
            FileOutputStream fos = new FileOutputStream(fileDest);
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File fileSrc = new File("macos.jpeg");
            File fileDest = new File("macos1.jpeg");
            fis = new FileInputStream(fileSrc);
            fos = new FileOutputStream(fileDest);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.atguigu.serializable;

import org.junit.Test;

import java.io.*;

/**
 * @author Wint
 * @create 2022-06-04 22:32
 */
public class SerializableTest {
    @Test
    public void test2(){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File file = new File("obj.dat");
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            String str = (String) obj;
            Person p1 = (Person) (ois.readObject());
            Person p2 = (Person) (ois.readObject());
            System.out.println(str);
            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
    public void test1(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            File file = new File("obj.dat");
            fos = new FileOutputStream(file);
//        ObjectInputStream ois = new ObjectInputStream(fis);
            oos = new ObjectOutputStream(fos);
            oos.writeObject("中华人民共和国");
            oos.flush();
            oos.writeObject(new Person("张三",32));
            oos.flush();
            oos.writeObject(new Person("李四",44));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oos != null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

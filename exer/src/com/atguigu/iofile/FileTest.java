package com.atguigu.iofile;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author Wint
 * @create 2022-06-01 15:32
 */
public class FileTest {
    @Test
    public void test5() throws IOException {
        File file1 = new File("D:\\IdeaProjectsBackup\\he.txt");
        File file2 = new File("D:\\IdeaProjectsBackup\\hello.txt");
        boolean newFile = file2.createNewFile();
        System.out.println(newFile);
        File file3 = new File("D:\\IdeaProjectsBackup\\test01\\test02");
        File file4 = new File("D:\\IdeaProjectsBackup\\test03\\test04");
        boolean mkdir = file3.mkdir();
        boolean mkdirs = file4.mkdirs();
        System.out.println(mkdir);
        System.out.println(mkdirs);
    }
    @Test
    public void test4(){
        File file = new File("D:\\IdeaProjectsBackup\\he.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
    }
    @Test
    public void test3(){
        File file = new File("hello.txt");
        boolean b = file.renameTo(new File("D:\\IdeaProjectsBackup\\he.txt"));
        System.out.println(b);
    }
    @Test
    public void test2(){
        File file1 = new File("D:","IdeaProjects");
        String[] list1 = file1.list();
        for(String str : list1){
            System.out.println(str);
        }
        File[] list2 = file1.listFiles();
        for(File file : list2){
            File f = file;
            System.out.println(f.toString());
        }
    }
    @Test
    public void test1(){
        File file1 = new File("Hello.txt");
        File file2 = new File("D:\\IdeaProjectsBackup\\he.txt");
        File file3 = new File("D:","IdeaProjectsBackup");
        File file4 = new File(file3,"his.txt");
        System.out.println(file1);
        System.out.println(file2);
        System.out.println(file3);
        System.out.println(file4);
        System.out.println("---------------------------");
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file3.length());
        System.out.println(new Date(file3.lastModified()));

    }
}

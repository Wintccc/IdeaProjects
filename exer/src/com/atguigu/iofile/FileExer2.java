package com.atguigu.iofile;

import java.io.File;

/**
 * @author Wint
 * @create 2022-06-01 19:48
 */
public class FileExer2 {
    ////遍历指定目录所有文件名称，包括子文件目录中的文件。
    //拓展1：并计算指定目录占用空间的大小
    //拓展2：删除指定文件目录及其下的所有文件
    public static void main(String[] args) {
        File file = new File("D:\\Program Files Green");
        getFile(file);
    }

    private static void getFile(File file){
        File[] f = file.listFiles();
        for(File ff : f){
            if(ff.isDirectory()){
                getFile(ff);
            }else{
                System.out.println(ff.getAbsolutePath());
            }
        }
    }
}

package ioOfTest;

import java.io.File;

/**
 * Created by WS on 2018/3/13.
 */
public class OperateFile {
    public static void main(String[] args) {
        File f1 = new File("E:\\weiShuai\\IO\\source.txt");
        File f2 = new File("ww.txt");
        File f3 = new File("E:\\weiShuai\\IO");
        File f4 = new File("E:\\weiShuai\\IO\\IOTest");

        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());

        System.out.println(f2.getName());
        System.out.println(f2.getPath());
        System.out.println(f2.getAbsoluteFile());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getParent());

        System.out.println(f1.renameTo(f2));


    }
}

package ioFirst;

/**
 * Created by weishuai on 2018/2/22.
 */

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

//完成字符流和字节流的输入输出
public class TestExer {

    // 字符流利用程序复制
    @Test
    public void test4() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\IO\\sources.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("D:\\IO\\target.txt"));
            char[] c = new char[1024];
            int len;
            while ((len = bufferedReader.read(c)) != -1) {
                bufferedWriter.write(c, 0, len);
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

    // 使用字符流实现内容的读出
    @Test
    public void test3() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("D:\\IO\\sources.txt"));
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }

    }

    // 使用字符流实现内容输入
    @Test
    public void test2() {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File("D:\\IO\\target.txt")));
            // 可以直接写成这个：bufferedWriter = new BufferedWriter(new FileWriter("test1.txt"));
            String string = "转换流：实现字节流与字符流之间的转换InputStreamReader输入时，\n" + "实现字节流到字符流的转换，提高操作的效率（前提是，数据是文本文件）\n"
                    + "===>解码：从字节数组到字符串（相对于人能看懂了，所以叫解释了，解码）\n" + " ===>编码：从字符流到字节流（相对于人把文字变成了数字，看不懂了，叫编码）\n"
                    + "OutputStreamWriter：输出时，实现字符流到字节流的转换。从看得懂到看不懂，\n"
                    + "在底层用0101存储。 ===>编码：从字符流到字节流（相对于人把文字变成了数字，看不懂了，叫编码）\n"
                    + "System.in:标准输入流：从键盘输入数据System.out:标准输出流：从显示器输出数据\n";

            bufferedWriter.write(string);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    // 使用字节流实现内容的输入
    @Test
    public void test1() {

        // 处理流缓冲流的创建
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("D:\\IO\\target.txt")));

            String string = "转换流：实现字节流与字符流之间的转换InputStreamReader输入时，\n" + "实现字节流到字符流的转换，提高操作的效率（前提是，数据是文本文件）\n"
                    + "===>解码：从字节数组到字符串（相对于人能看懂了，所以叫解释了，解码）\n" + " ===>编码：从字符流到字节流（相对于人把文字变成了数字，看不懂了，叫编码）\n"
                    + "OutputStreamWriter：输出时，实现字符流到字节流的转换。从看得懂到看不懂，\n"
                    + "在底层用0101存储。 ===>编码：从字符流到字节流（相对于人把文字变成了数字，看不懂了，叫编码）\n"
                    + "System.in:标准输入流：从键盘输入数据System.out:标准输出流：从显示器输出数据\n";

            // 将一个字符串转化成字节数组，并写出到文件
            bufferedOutputStream.write(string.getBytes());

        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (bufferedOutputStream != null) {
                // 关闭缓冲流，就会关闭相应的字节流
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

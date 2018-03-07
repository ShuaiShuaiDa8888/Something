import java.io.*;

/**
 * Created by WS on 2018/3/2.
 */
public class CopyIO {

    public void copy() throws IOException {
        readAndWrite();
    }

    public static void readAndWrite() throws IOException {
        //定义需要读写的文件。。
        FileInputStream fileInputStream = new FileInputStream("E:\\weiShuai\\IO\\source.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\weiShuai\\IO\\target.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        byte[] b = new byte[1024];
        int len = 0;
        try {
            while ((len = bufferedInputStream.read(b) ) != -1 ) {
                bufferedOutputStream.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedInputStream.close();
            bufferedOutputStream.close();
        }
    }
}


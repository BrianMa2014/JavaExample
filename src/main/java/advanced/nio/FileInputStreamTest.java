package advanced.nio;

import java.io.*;

/**
 * Created by MaMingJiang on 2016/5/23.
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        File file = new File("D:/testFileInputStream.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            InputStream fileInputStream = null;
            try {
            fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[4];
            int read = fileInputStream.read(bytes);
            System.out.println("read:"+read);
            while(read != -1){
                for(int i=0;i<read;i++) {
                    System.out.println((char) bytes[i]);
                }
                read = fileInputStream.read(bytes);
                System.out.println("read:"+read);
            }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(fileInputStream !=null){
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

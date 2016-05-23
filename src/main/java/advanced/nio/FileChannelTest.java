package advanced.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by MaMingJiang on 2016/5/23.
 */
public class FileChannelTest {

    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("D:/testFileInputStream.txt","rw");
            //通道
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(4);
            int read = channel.read(buffer);
            while(read != -1){
                buffer.flip();
                while(buffer.hasRemaining()){
                    System.out.println((char) buffer.get());
                }
                buffer.clear();
                read = channel.read(buffer);
            }
            randomAccessFile.close();

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}

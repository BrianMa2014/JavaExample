package advanced.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by MaMingJiang on 2016/5/23.
 */
public class ChannelTransformTest {
    //to be continued
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile1 = new RandomAccessFile("D:/from.txt","rw");
            FileChannel fileChannel1 = randomAccessFile1.getChannel();

            RandomAccessFile randomAccessFile2 = new RandomAccessFile("D:/to.txt","rw");
            FileChannel fileChannel2 = randomAccessFile2.getChannel();

            long position = 1;
            long count = 2;

            fileChannel2.transferFrom(fileChannel1,position,count);

            ByteBuffer buffer = ByteBuffer.allocate(8);
            byte b = 65;
            buffer.put(b).flip();
            int write = fileChannel2.write(buffer);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

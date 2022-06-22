import java.io.*;

public class ByteRead {
    public static void main(String[] args) throws Exception{
        FileInputStream fi = new FileInputStream("D://ip.bin");
        for (int i = 0; i < 15; i++) {
            System.out.print(fi.read());
        }
        fi.close();
    }
}

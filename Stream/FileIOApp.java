package Stream;

import java.io.*;

public class FileIOApp {
    public static void main(String[] args) throws IOException{
        // Create output test.txt file
        FileOutputStream fout = new FileOutputStream("./test.txt");
        String s = "This is a string";
        for (int i = 0; i < s.length(); i++) {
            fout.write(s.charAt(i));
        }
        fout.close();

        // Open FileInputStream to read the file from test.txt
        FileInputStream fin = new FileInputStream("./test.txt");
        int inByte = fin.available();
        System.out.println("File Input Stream contains "+ inByte + " bytes");
        byte[] inBuf = new byte[inByte];
        int byteRead = fin.read(inBuf, 0, inByte);
        System.out.println(byteRead+" bytes were read");
        System.out.println("They are : "+new String(inBuf));
        fin.close();
        File f = new File("./test.txt");
        f.deleteOnExit();
    }
}

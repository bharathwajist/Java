package Stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.System;

public class ByteArrayIOApp {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("./text.txt");
        // Creating a ByteArrayOutputStream Object
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String s = "This is test string";
        // Write output to stream
        for (int i = 0; i < s.length(); i++){
            outputStream.write(s.charAt(i));
            fout.write(s.charAt(i));
        }
        System.out.println("OutputStream : "+outputStream);
        System.out.println("Size of OutputStream : "+outputStream.size());

        // Creating a ByteArrayInputStream Object
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        
        // Determine how many input bytes are available 
        System.out.println("No of bytes available in "+ inputStream.available());

        byte inBuf[] = new byte[inputStream.available()];

        // Read input into byte array
        int byteRead = inputStream.read(inBuf, 0, inputStream.available());

        System.out.println(byteRead+" Bytes were read");
        System.out.println("They are : "+new String(inBuf));
        fout.close();
    }
}

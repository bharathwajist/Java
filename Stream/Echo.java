package Stream;
import java.io.*;

public class Echo {
    public static void main(String[] args) throws IOException {
        echo(System.in);
    }

    public static void echo(InputStream in) throws IOException {
        while(true){
            // Notice that although a byte is read, an int
            // with value between 0 to 255 is returned

            // Lets see
            int i = in.read();
            // -1 is returned to indicate the end of the stream
            if(i == -1)
                break;
            char c = (char)i;
            System.out.print(c);
        }
        System.out.println();
    }
}

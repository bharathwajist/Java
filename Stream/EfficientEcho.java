package Stream;
import java.io.*;

public class EfficientEcho {
    public static void main(String[] args) throws IOException {
        echo(System.in);
    }

    private static void echo(InputStream in) throws IOException{
        while(true){
            // What this returns?
            int n = in.available();
            if(n > 0){
                byte[] b = new byte[n];
                int result = in.read(b);
                if(result == -1) break;
                String s = new String(b);
                System.out.print(s);
            }
        }
    }
}

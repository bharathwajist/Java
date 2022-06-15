import java.util.*;
import java.io.*;

class Files extends Thread{
    
    public static void main(String[] args) throws Exception{
        // fo.write();
        FileOutputStream fo1 = new FileOutputStream("d:\\list1.txt");
        FileOutputStream fo2 = new FileOutputStream("d:\\list2.txt");
        FileInputStream fi1 = new FileInputStream("d:\\list1.txt");
        FileInputStream fi2 = new FileInputStream("d:\\list2.txt");
        // System.out.println(Check(fi1));
        // System.out.println(Check(fi2));
        WriteFirst(fo1);
        System.out.println(Thread.currentThread());
        Thread.sleep(2000);
        WriteSecond(fo2);
        ReadFirst(fi1);
        System.out.println(Thread.currentThread());
        Thread.sleep(2000);
        ReadSecond(fi2);
    }

    public static int Check(FileInputStream fi) throws IOException{
        return fi.available();
    }
    public static void ReadSecond(FileInputStream fi) throws IOException {
        System.out.println("Reading Second File");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (byte i = 0; i <= 10; i++) {
            int n = fi.read();
            list.add(n);
        }

        System.out.println(list);
        fi.close();
    }

    public static void WriteSecond(FileOutputStream fo) throws IOException{
        System.out.println("Writing Second File");
        for (byte i = 10; i <= 20; i++) {
            fo.write(i);
        }
        fo.close();
    }

    public static void WriteFirst(FileOutputStream fo) throws IOException{
        System.out.println("Writing First File");
        for (byte i = 0; i < 10; i++) {
            fo.write(i);
        }
        fo.close();
    }

    public static void ReadFirst(FileInputStream fi) throws IOException{
        System.out.println("Reading First File");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (byte i = 0; i < 10; i++) {
            int n = fi.read();
            list.add(n);
        }

        System.out.println(list);
        fi.close();
    }
}
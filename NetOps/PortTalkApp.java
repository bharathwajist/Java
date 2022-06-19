package NetOps;

import java.net.*;
import java.io.*;

public class PortTalkApp {
    public static void main(String[] args) {
        // Make an object for Class
        PortTalk portTalk = new PortTalk(args);
        portTalk.displayDestinationParameters();
        portTalk.displayLocalParameters();
        portTalk.chat();
        portTalk.shutdown();
    }
}

class PortTalk {
    Socket connection;
    DataOutputStream outStream;
    BufferedReader inStream;

    public PortTalk(String[] args) {
        if (args.length != 2)
            error("Usage : Java PortTalkApp host app");

        // Taking first argument as destination
        String destination = args[0];

        // Initializing a port value as 0
        int port = 0;

        try {
            port = Integer.valueOf(args[1]).intValue();
        } catch (NumberFormatException ex) {
            error("Invalid Port number");
        }

        try {
            connection = new Socket(destination, port);
        } catch (UnknownHostException ex) {
            error("Unknown Host");
        } catch (IOException ex) {
            error("IO Error creating socket");
        }

        try {
            inStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            outStream = new DataOutputStream(connection.getOutputStream());
        } catch (IOException ex) {
            error("IO error getting streams");
        }
        System.out.println("Connected to " + destination + " at port " + port + ".");
    }

    public void displayDestinationParameters(){
        InetAddress destAddres = connection.getInetAddress();
        String name = destAddres.getHostName();
        byte[] ipAddress = destAddres.getAddress();
        int port = connection.getPort();
        displayParameters("Destination ", name, ipAddress, port);
    }

    public void displayLocalParameters(){
        InetAddress localAddress = null;
        try{
            localAddress = InetAddress.getLocalHost();
        }catch(IOException ex){
            error("Error getting local host information");
        }
        String name = localAddress.getHostName();
        byte[] ipAddress = localAddress.getAddress();
        int port = connection.getLocalPort();
        displayParameters("Local ", name, ipAddress, port);
    }
    public void displayParameters(String s, String name, byte ipAddress[], int port) {
        System.out.println(s + " host is " + name + ".");
        System.out.println(s + " IP address is");

        for (int i = 0; i < ipAddress.length; i++) {
            System.out.print((ipAddress[i] + 256) % 256 + ".");
        }

        System.out.println();
        System.out.println(s + " port number is " + port + ".");
    }

    public void chat(){
        BufferedReader keyboardInput = new BufferedReader(new InputStreamReader(System.in));
        boolean finished = false;
        do{
            try{
                System.out.print("Send, Recieve, or quit (S/R/Q) : ");
            System.out.flush();
            String line = keyboardInput.readLine();
            if(line.length()>0){
                line = line.toUpperCase();
                switch(line.charAt(0)){
                    case 'S':
                        String sendLine = keyboardInput.readLine();
                        outStream.writeBytes(sendLine);
                        outStream.write(13);
                        outStream.write(10);
                        outStream.flush();
                        break;
                    case 'R':
                        int inByte;
                        System.out.println("***");
                        while((inByte = inStream.read()) != '\n'){
                            System.out.write(inByte);
                        }
                        System.out.println();
                        break;
                    case 'Q':
                        finished = true;
                        break;
                    default:
                        break;
                }
            }
        }catch(IOException ex){
            error("Error reading from keyboard or socket");
        }
    }while(!finished);
    }

    public void shutdown(){
        try{
            connection.close();
        }catch(Exception ex){
            error("IO error closing socket");
        }
    }
    public void error(String str) {
        System.out.println(str);
        System.exit(1);
    }
}

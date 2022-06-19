package Stream;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage : java FileCopy <source file> <destination>");
        } else {
            // Call copy() to do the copy, and display any error messages it throws
            try {
                copy(args[0], args[1]);
            } catch (IOException io) {
                System.err.println(io.getMessage());
            }
        }
    }

    public static void copy(String from_name, String to_name) throws Exception {
        File from_file = new File(from_name);
        File to_file = new File(to_name);

        // To make sure the file exists or not use .exist() function
        if (!from_file.exists())
            abort("FileCopy : no such source file : " + from_name);
        // to check whether it is a file or directory use .isFile() function
        if (!from_file.isFile())
            abort("FileCopy : can't be a directory : " + from_name);
        // to check whether the fuke is readable or not use .canRead() function
        if (!from_file.canRead())
            abort("FileCopy : can't read this file : " + from_name);

        // If the destination is a directory, use source file name as a destination file
        // name
        if (to_file.isDirectory())
            to_file = new File(to_file, from_file.getName());

        // If destination file exists, Make sure whether it is readable or not
        // And ask before overwriting
        if (to_file.exists()) {
            if (to_file.canWrite()) {
                abort("FileCopy : destination file is unwrittable : " + to_name);
                System.out.println("Overwriting existing file ? " + to_name + "? (Yes/No) : ");
                System.out.flush();
                // Get the user response
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String response = in.readLine();
                // Check the response
                if (!response.equals("Y") || !response.equals("y")) {
                    abort("FileCopy : Existing file is not overwritten");
                }
            }
        } else {
            String parent = to_file.getParent();
            if (parent == null) {
                parent = System.getProperty("user.dir");
            }
            File dir = new File(parent);
            if (!dir.exists())
                abort("FileCopy : destination directory does not exist : " + parent);
            if (dir.isFile())
                abort("FileCopy : destination file is not a directory : " + parent);
            if (!dir.canWrite())
                abort("FileCopy : destination directory is unwritable : " + parent);
        }

        FileInputStream from = null;
        FileOutputStream to = null;

        try{
            from = new FileInputStream(from_file);
            to = new FileOutputStream(to_file);

            byte[] buffer = new byte[4096];
            int byte_read;
            
            while((byte_read = from.read(buffer)) != -1){
                to.write(buffer, 0 , byte_read);
            }
        }finally{
            if(from != null) try{ from.close();}catch(IOException e){};
            if(to != null) try{ to.close();}catch(IOException e){};
        }
    }

    static void abort(String str) throws Exception{
        throw new IOException(str);
    }
}

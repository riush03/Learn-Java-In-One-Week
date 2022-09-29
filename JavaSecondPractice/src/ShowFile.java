import java.io.*;

public class ShowFile {
    public static void main(String[] args)
    {
        int i;
        FileInputStream fileInputStream = null;

        //confirm that the files have been specifiedd
        if(args.length != 1)
        {
            System.out.println("Usage:Show filename");
            return;
        }

        //Attempt to open a file
        try
        {
            do {
                i = fileInputStream.read();
                if(i != -1 ) System.out.println((char) i);
            } while (i != -1);
        }catch (IOException e)
        {
            System.out.println("Error: Reading the file");
        }

        //close the file
        try
        {
            fileInputStream.close();

        }catch (IOException e)
        {
            System.out.println("Error closing the file");
        }
    }
}

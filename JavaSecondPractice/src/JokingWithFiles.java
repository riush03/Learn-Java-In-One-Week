import java.io.File;
import java.io.InputStream;

public class JokingWithFiles {
    public static void main(String[] args)
    {
        File file = new File("./data.txt");
        //get the absolute file path
        System.out.println(file.getAbsolutePath());

        //read the file
        //
         try(InputStream in = ReadingFiles.class.getResourceAsStream(".data.txt"))
        {
            int data;
            while((data = in.read())!= -1)
            {
                System.out.println(((char)data)+"");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

import java.io.FileInputStream;

public class ReadingFiles {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\San\\IdeaProjects\\JavaSecondPractice\\src\\data.txt";

        try (FileInputStream fin = new FileInputStream(filePath)) {
            int data;
            while((data = fin.read())!= -1)
            {
                System.out.println(((char)data)+"");
            }
        }catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}

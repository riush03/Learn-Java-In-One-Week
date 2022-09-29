import java.io.File;
import java.util.Scanner;

public class ScanningFiles {
    public static void main(String[] args)
    {
        String filePath = "C:\\Users\\San\\IdeaProjects\\JavaSecondPractice\\src\\data.txt";
        try(Scanner scan = new Scanner(new File(filePath)))
        {
            while (scan.hasNext())
            {
                System.out.println(scan.nextLine());
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write something:");
        while(scan.hasNext())
        {
            String line = scan.nextLine();
            if("end".equals(line))
            {
                System.exit(0);
            }
            System.out.println(line);
        }
    }
}

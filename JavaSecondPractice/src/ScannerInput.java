import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args)
    {
        String input = "child mom dad";
        Scanner scan = new Scanner(input);

        while (scan.hasNext())
        {
            System.out.println(scan.next());
        }
    }
}

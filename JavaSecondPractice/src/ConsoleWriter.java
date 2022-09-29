import java.io.Console;
import java.io.PrintWriter;
import java.io.Reader;

public class ConsoleWriter {
    private static Console console;

    public static void main(String[] args)
    {
       

        try(Reader reader = console.reader())
        {
            char[] chars = new char[10];
            System.out.println("Enter something:");
            reader.read(chars);
            System.out.println("You entered:"+new String(chars));
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        PrintWriter out = console.writer();
        out.println("Am Denis Muriungi");
        console.flush();
    }
}

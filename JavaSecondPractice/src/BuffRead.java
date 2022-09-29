import java.io.*;

public class BuffRead {
    public static void main(String[] args) throws IOException {
        char ch;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, String.valueOf(System.console())));

        System.out.println("Enter character q to quit");

        do{
            ch = (char) bufferedReader.read();
            System.out.println(ch);
        } while (ch != 'q');

    }


    }
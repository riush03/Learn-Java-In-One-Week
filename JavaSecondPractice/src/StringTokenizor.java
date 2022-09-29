import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class StringTokenizor {
    public static void main(String[] args)
    {
        String f_path = "C:\\Users\\San\\IdeaProjects\\JavaSecondPractice\\src\\data.txt";
        try(FileReader  fileReader = new FileReader(f_path);
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
            streamTokenizer.eolIsSignificant(true);
            streamTokenizer.commentChar('e');
            System.out.println("Line: "+streamTokenizer.lineno()+":");
            int i;
            while ((i = streamTokenizer.nextToken()) != StreamTokenizer.TT_EOF)
            {
                switch (i)
                {
                    case StreamTokenizer.TT_EOF ->
                    {
                        System.out.println("\nLine: "+streamTokenizer.lineno()+":");
                        break;
                    }
                    case StreamTokenizer.TT_WORD ->
                    {
                        System.out.println("\nTT_WORD: "+streamTokenizer.sval);
                        break;
                    }
                    case  StreamTokenizer.TT_NUMBER ->
                    {
                        System.out.println("\nTT_NUMBER =>"+streamTokenizer.nval);
                        break;
                    }
                    default ->
                    {
                        System.out.println("\n UNexpexcted =>"+streamTokenizer.ttype);
                    }
                }
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

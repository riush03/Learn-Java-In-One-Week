import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtilities {
    public static void main(String[] args)
    {
        //method copy()
        List<String> lister = Arrays.asList("s1","s2");
        List<String> lister1 = Arrays.asList("s3","s4","s5","s8","s7");
        Collections.copy(lister1,lister);
        System.out.println(lister1);
        //method sort()
        Collections.sort(lister1);
        System.out.println(lister1);

    }
}

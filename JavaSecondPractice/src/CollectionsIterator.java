import java.util.List;

public class CollectionsIterator {
    public static void main(String[] args)
    {
        Iterable<String> list = List.of("s1","s2","s3");
        System.out.println(list); //print [s1,s2,s3]
        for(String e:list)
        {
            System.out.print(e+" "); //print s1 s2 s3
        }
        list.forEach(e-> System.out.println("\n"+e+" "));
    }
}

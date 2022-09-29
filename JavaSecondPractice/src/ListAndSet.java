import java.util.*;

public class ListAndSet {
    //this program shows how to intialize a list
    public static void main(String[] args)
    {
        Collection<String> coll = List.of("s1","s2","s3");
        System.out.println(coll);
        coll = Set.of("s4","s5");
        System.out.println(coll);

        //list
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s1");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1+"using add all");

        Set<String> my_set = new HashSet<>();
        my_set.add("s4");
        my_set.add("s4");
        System.out.println(my_set);
    }
}

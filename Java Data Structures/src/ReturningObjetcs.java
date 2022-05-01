public class ReturningObjetcs {
    int a;

    ReturningObjetcs(int i)
    {
        a =i;
    }

    ReturningObjetcs incenmentByTen()
    {
        ReturningObjetcs temp = new ReturningObjetcs(a+10);
        return temp;
    }

}

class RetObjs{
    public static void main(String[] args)
    {
        ReturningObjetcs my_obj = new ReturningObjetcs(10);
        ReturningObjetcs obj2;

        obj2 = my_obj.incenmentByTen();
        System.out.println("my_obj.a "+my_obj.a);
        System.out.println("obj2.a "+obj2.a);

    }
}

public class StaticDemo {
    static int a = 24;
    static  int b = 79;

    static void callMe()
    {
        System.out.println("a ="+a);
    }


}

class StaticTest{
    public static void main(String[] args)
    {
        StaticDemo.callMe();
        System.out.println("b ="+StaticDemo.b);
    }
}
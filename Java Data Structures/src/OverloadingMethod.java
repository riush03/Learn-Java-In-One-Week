public class OverloadingMethod {
    void test()
    {
        System.out.println("No params");
    }

    //overloading
    void test(int a)
    {
        System.out.println("a:"+a);
    }

    void test(int a, int b)
    {
        System.out.println("a and b"+a+" , "+b);
    }

    double test(double a)
    {
        System.out.println("Double a"+a);
        return a*a;
    }
}

class MyOverload{
    public static void main(String[] args)
    {
        OverloadingMethod overload = new OverloadingMethod();
        double result;

        //call all version of the test
        overload.test();
        overload.test(10);
        overload.test(5,6);
        result = overload.test(123.51);
        System.out.println("Result of "+result);
    }
}

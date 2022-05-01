public class Outer {
    int outer_x = 100;

    void test()
    {
        for(int i =0; i<10; i++)
        {
            class MyInner{
                void display()
                {
                    System.out.println("display : outer_x :"+outer_x);
                }
            }
            MyInner myinner = new MyInner();
            myinner.display();
        }
    }
}

class InnerClassDemo{
    public static void main(String[] args)
    {
        Outer ourer = new Outer();
        ourer.test();
    }
}

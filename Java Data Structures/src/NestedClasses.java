public class NestedClasses {
    int outer_x =100;

    void test()
    {
        Inner inside = new Inner();
        inside.display();
    }

    //this is a inner class
    class Inner{
        void display()
        {
            System.out.println("display: outer_x "+outer_x);
        }
    }
}

class InnerTest{
    public static void main(String[] args)
    {
        NestedClasses outer = new NestedClasses();
        outer.test();
    }
}

public class A {
    int i,j;

    void showij()
    {
        System.out.println("i and j : "+i+","+j);
    }


}

//create a subclass by extending A
class B extends A{
    int k;

    void showk()
    {
        System.out.println("k is: "+k);
    }

    void sum()
    {
        System.out.println("i+j+k = "+(i+j+k));
    }
}

class SimpleInheritance{
    public static void main(String[] args)
    {
        A super_o = new A();
        B sub_o = new B();

        //user superclass
        super_o.i = 10;
        super_o.j = 20;

        System.out.println("Content of superclass");
        super_o.showij();
        System.out.println();

        //the subclass has access to all variable of it extendes subclass
        sub_o.i = 5;
        sub_o.j = 7;
        sub_o.k = 8;
        System.out.println("Contents of subon");
        sub_o.showij();
        System.out.println();

        System.out.println("Sum of i, j and k in subob");
        sub_o.sum();

    }
}

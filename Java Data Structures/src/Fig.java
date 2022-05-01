abstract class Fig {
    double dim1;
    double dim2;

    Fig(double a,double b)
    {
        dim1 =a;
        dim2 =b;
    }
    //make area an abstract method
    abstract double area();
}

class Rect extends Fig{
    Rect(double a,double b)
    {
        super(a,b);
    }

    //overide area
    double area()
    {
        System.out.println("Inside the area of a rectangle");
        return dim1*dim2;
    }
}

class Triang extends Fig{
    Triang(double a,double b)
    {
        super(a,b);
    }
    //over area
    double area() {
        System.out.println("Inside area of the Triangle");
        return dim1*dim2/2;
    }
}

class AbstArea{
    public static void  main(String[] args)
    {
        Rect rec = new Rect(45,13);
        Triang triang = new Triang(6,90);

        Fig figref;
        figref = rec;
        System.out.println("The area is "+figref.area());

        figref = triang;
        System.out.println("The area is "+figref.area());
    }
}

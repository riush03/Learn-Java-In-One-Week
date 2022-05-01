public class Figure {
    double dim1;
    double dim2;

    Figure(double a,double b)
    {
        dim1 = a;
        dim2 = b;
    }

    double area()
    {
        System.out.println("Thea ra of the figure is undefined");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a,double b)
    {
        super(a,b);
    }
    //overide the area of the rectangle
    double area()
    {
        System.out.println("Inside the area of a rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a,double b)
    {
        super(a,b);
    }
    //override area
    double area()
    {
        System.out.println("Inside the area of a triangle");
        return dim1*dim2/2;
    }
}

class FindAreas{
    public static void main(String[] args)
    {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(6,8);
        Figure figret;
        figret = r;
        System.out.println("The area is "+figret.area());
        figret = t;
        System.out.println("The area is "+figret.area());
        figret = f;
        System.out.println("The area is "+figret.area());
    }
}
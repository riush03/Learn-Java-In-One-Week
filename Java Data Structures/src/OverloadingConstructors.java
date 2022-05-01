public class OverloadingConstructors {
    double width;
    double height;
    double length;

    //constroctor use wen all dimensions are specified
    OverloadingConstructors(double w,double h, double l)
    {
        width = w;
        height = h;
        length = l;
    }

    //constructor when no dimensions are specified
    OverloadingConstructors()
    {
        width = -1;
        height = -1;
        length = -1;
    }

    //Constructor used when the cube is created
    OverloadingConstructors(double len)
    {
        width = height = length = len;
    }

    //comute and return volume
    double volume()
    {
        return width*height*length;
    }
}

class OverloadCon{
    public static void main(String[] args)
    {
        OverloadingConstructors overload_cube = new OverloadingConstructors(10,20,30);
        OverloadingConstructors cube = new OverloadingConstructors();
        OverloadingConstructors cube_2 = new OverloadingConstructors(8);

        double vol;

        vol = overload_cube.volume();
        System.out.println("Volume is "+vol);

        vol = cube.volume();
        System.out.println("Volume of cube"+vol);

        vol = cube_2.volume();
        System.out.println("The volume of cube 2 is "+vol);
    }
}
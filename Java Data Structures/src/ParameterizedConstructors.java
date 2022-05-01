public class ParameterizedConstructors {
    double width;
    double height;
    double length;

    //Constructor for my cube
    ParameterizedConstructors(double w,double h,double l)
    {
        width =  w;
        height = h;
        length = l;
    }

    double volume()
    {
        return width*height*length;
    }
}

class CobeVolume{
    public static void main(String[] args)
    {
        ParameterizedConstructors cube_vol = new ParameterizedConstructors(5,5,5);
        double vol;

        vol = cube_vol.volume();

        System.out.println("The volume of the cube is "+vol);
    }
}

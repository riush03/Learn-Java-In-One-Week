public class UsingAConstructor {
    double width;
    double height;
    double length;

    //create a constructor
    UsingAConstructor()
    {
        System.out.println("Constructing a cubic");
        width = 5;
        height = 5;
        length = 5;
    }

    double volume()
    {
        return width*height*length;
    }
}

class CubeVol{
    public static void main(String[] args)
    {
        UsingAConstructor cube_v = new UsingAConstructor();
        double vol;

        //get volume of the cube
        vol = cube_v.volume();
        System.out.println("The volume is "+vol);
    }
}

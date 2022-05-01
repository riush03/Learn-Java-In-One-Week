public class ThisKeyword {
    double width;
    double height;
    double length;

    ThisKeyword(double w,double h,double l)
    {
        this.width = h;
        this.height = h;
        this.length = l;
    }

    double volume()
    {
        return width * height * length;
    }
}

class CubeVolo{
    public static void main(String[] args)
    {
        ThisKeyword cuve_vol = new ThisKeyword(5,5,5);
        double vol;

        vol = cuve_vol.volume();

        System.out.println("The volume of the cube is "+vol);
    }
}

public class MethodParams {
    double width;
    double height;
    double length;

    double volume()
    {
        return width*height*length;
    }

    //method to send dimensions
    void setDimensions(double w,double h,double l)
    {
        width = w;
        height = h;
        length = l;
    }
}

class DispVol{
    public  static  void main(String[] args)
    {
        MethodParams cube_vol = new MethodParams();
        double vol;

        cube_vol.setDimensions(10,20,30);
        vol = cube_vol.volume();

        System.out.println("The volume is "+vol);
    }
}

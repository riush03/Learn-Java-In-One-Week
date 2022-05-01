public class ReturnSomething {
    double width;
    double height;
    double length;

    //compute and return volume
    double volume()
    {
        return width*height*length;
    }
}

class VolumeBox{
    public static void main(String[] args)
    {
        ReturnSomething vol = new ReturnSomething();
        double volu;

        vol.width = 10;
        vol.height = 20;
        vol.length = 30;

        volu = vol.volume();

        System.out.println("The volume is "+volu);
    }
}

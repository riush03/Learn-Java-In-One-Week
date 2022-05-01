public class WaterContainer {
    double width;
    double height;
    double length;

    //This constructor takes object of type Box
    WaterContainer(WaterContainer ob)
    {
        //pass constructor to object
        width = ob.width;
        height = ob.height;
        length = ob.length;

    }

    //when all dimensions are specified
    WaterContainer(double w,double h,double l)
    {
        width = w;
        height = h;
        length = l;
    }

    //construct used when no dimension is specified
    WaterContainer()
    {
        width = -1;
        height = -1;
        length = -1;
    }

    //constructor used when a cube is created
    WaterContainer(double len)
    {
        width = height = length = len;
    }

    //compute and return volume
    double volume()
    {
        return width*height*length;
    }
}

class GetVolume{
    public static void main(String[] args)
    {
        WaterContainer water_container = new WaterContainer(10,20,30);
        WaterContainer clone_container = new WaterContainer(water_container); //create a copy of water_container
        double vol;

        vol = water_container.volume();
        System.out.println("The volume of the container is"+vol);

        //get the volume of the clone container
        vol = clone_container.volume();
        System.out.println("The volume of the clne container is"+vol);
    }
}

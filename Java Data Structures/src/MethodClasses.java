public class MethodClasses {
    double width;
    double height;
    double length;

    //method to calculate the volume
    void getVolume() {
        System.out.print("The volume is ");
        System.out.println(width * height * length);
    }
}

class Volume{
    public static void main(String[] args)
    {
        MethodClasses vol = new MethodClasses();

        vol.width = 10;
        vol.height = 20;
        vol.length = 30;

        //display volume
        vol.getVolume();
    }

}
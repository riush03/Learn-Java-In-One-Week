class Box {
    double width;
    double height;
    double depth;
}


//this class devare of object of class nox
class BoxDemo{
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 30;

        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("The volume is "+vol);
    }

}
public class LifetimeVar {
    //Demonstrating the lifetime of a variable
    /** the lifetime of a variable contained in {} ends **/
    public static void main(String[] args)
    {
        int x;
        for(x=0; x<3; x=x+1)
        {
            //y is intialized every time the block is entered
            int y = -1;
            System.out.println("The value of y "+y);
            System.out.println("The value of y now is "+y);
        }
    }
}

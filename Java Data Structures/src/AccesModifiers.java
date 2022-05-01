public class AccesModifiers {
    int a; //defaiult acess
    public int b; //public access
    private int c;//private access

    //method to access c
    void setc(int i)
    {
        //set c's value
        c = i;
    }

    int getc()
    {
        return  c;
    }


}

class AccessTest{
    public static void main(String[] args)
    {
        AccesModifiers acces_mod = new AccesModifiers();

        acces_mod.a = 10;
        acces_mod.b = 20;

        //the following will result to an error
       // acces_mod.c =100;

        /**
         * c must be access through a method
         */
        acces_mod.setc(100);
        System.out.println("a , b and c are "+acces_mod.a+","+acces_mod.b+" and "+acces_mod.getc());
    }
}

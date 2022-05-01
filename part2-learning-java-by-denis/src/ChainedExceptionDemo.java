public class ChainedExceptionDemo {
    static void demoProc()
    {
        //create an exception
        NullPointerException e = new NullPointerException("top layer");

        //add a cause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args)
    {
        try{
            demoProc();
        } catch (NullPointerException e)
        {
            System.out.println("Caught "+e);

            //display caught exception
            System.out.println("Original cause "+e.getCause());
        }
    }
}

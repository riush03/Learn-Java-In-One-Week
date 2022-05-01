public class ThrowDemo {
    static void demoProc()
    {
        try{
            throw new NullPointerException("demo");
        } catch(NullPointerException e)
        {
            System.out.println("Caught in demoProc");
            throw e;
        }
    }
    public static void main(String[] args)
    {
        try{
            demoProc();
        }catch (NullPointerException e)
        {
            System.out.println("Recaught "+e);
        }
    }
}

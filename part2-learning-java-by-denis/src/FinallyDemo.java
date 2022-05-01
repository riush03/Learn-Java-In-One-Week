public class FinallyDemo {
    static void procA()
    {
        try{
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        }finally {
            System.out.println("procA finally");
        }
    }

    //return from within procB
    static void procB() {
        try {
            System.out.println("Inside procB");
            return;
        } finally {
            System.out.println("ProcB finally");
        }
    }

    //Execute a try block normally
    static void procC()
    {
        try{
            System.out.println("Inside procC");
        } finally {
            System.out.println("ProcC finally");
        }
    }

    public static void main(String[] args)
    {
        try{
            procA();
        }catch (Exception e)
        {
            System.out.println("Exception caught");
        }

        procB();
        procC();
    }
}

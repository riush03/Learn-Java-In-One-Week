public class RecursionInJava {
    //thid is a recursive method
    int fact(int n)
    {
        int result;

        if(n == 1) return 1;
        result = fact(n-1)*n;
        return result;
    }
}

class Recursion{
    public static void main(String[] args)
    {
        RecursionInJava f = new RecursionInJava();

        System.out.println("The factorial of 3 is "+f.fact(3));
        System.out.println("The factorial of 4 is "+f.fact(4));
    }
}

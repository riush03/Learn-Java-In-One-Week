public class IfControlStatement {

    public static void main(String[] args)
    {
        //declare two variables x and y
        int x, y;

        //assign values to the declared variables
        x = 5;
        y = 10;

        if(x < 7) System.out.println("X is greater than y");

        x = x * 2;

        if(x == y) System.out.println("X is equal to y");

        x = x * 2;

        if(x > y) System.out.println("X is greater than y");
    }
}

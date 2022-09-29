//A function interfacce
interface NumericTest{
    boolean test(int n);
}
public class LambdaExpression {
    public static void main(String[] args)
    {
        //a lambda expression that test if a certain number is even
        NumericTest isEven = (n) -> (n%2) == 0;

        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is not even");
    }
}

interface FacTest
{
    int fac(int n);
}
public class FactorialTest {
    public static void main(String[] args) {
        FacTest factorialTest = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("The factorial of 3 is  = "+factorialTest.fac(3));
        System.out.println("The factor 0f 10 is = "+factorialTest.fac(10));
    }
}

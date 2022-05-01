public class DynamicInitOfVars {
    public static void main(String[] args)
    {
        //declare variables directly
        double a = 5.0, b = 6.0;

        //declare var c dynamically
        double c = Math.sqrt(a*a + b*b);

        System.out.println("The value of the hyponenuse is:" +c);
    }
}

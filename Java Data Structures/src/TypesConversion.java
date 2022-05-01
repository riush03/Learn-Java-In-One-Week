public class TypesConversion {
    public static void main(String[] args)
    {
        byte b;
        int i  = 257;
        double d = 353.657;

        System.out.println("Conversiom of int to byte");

        b = (byte) i;
        System.out.println("i and b "+i+" and "+b);

        System.out.println("Conversion of double to int");
        i = (int) d;
        System.out.println("i and d "+i+" and "+d);

        System.out.println("Conversion of double to byte");
        b = (byte) d;
        System.out.println("b and d "+b+" and "+d);
    }
}

public class SecondSimpleProgram {
    public static void main(String[] args)
    {
        //declare an integer variable called num
        int num;

        //assign the variable num a value
        num = 1000;

        System.out.println("This is num:"+num);

        num = num * 2;

        /**
         * The method print() does not introduce a newline while println() does
         * */
        System.out.print("The value of num * 2 is ");
        System.out.println(num);
    }
}

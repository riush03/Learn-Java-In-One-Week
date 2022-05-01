public class ForEach {
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        //use for-eh style to display sum of numbers
        for(int x : nums)
        {
            System.out.println("The vales is "+x);
            sum += x;

        }
        System.out.println("The summation is "+sum);
    }
}

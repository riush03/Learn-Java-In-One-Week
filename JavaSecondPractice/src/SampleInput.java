import java.util.Scanner;

//we use class Scanner to get input in java
public class SampleInput {
    public static void main(String[] args)
    {
        int numOfContainers,fruitsPerBasket,fruits;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fruits in each basket");
        fruitsPerBasket = input.nextByte();

        System.out.println("Enter the number of containers:");
        numOfContainers = input.nextInt();

        fruits = numOfContainers*fruitsPerBasket;

        System.out.println("If you have "+numOfContainers+" and "+fruitsPerBasket+" then you will have a total of "+fruits+" fruits.");
    }
}

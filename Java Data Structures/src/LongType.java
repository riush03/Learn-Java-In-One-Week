public class LongType {
    public static void main(String[] args)
    {
        int speed_of_light;
        long days;
        long seconds;
        long distance;

        speed_of_light = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = speed_of_light * seconds;

        System.out.print("In "+days);
        System.out.print(" days light will travel about ");
        System.out.println(distance+" miles.");
    }
}

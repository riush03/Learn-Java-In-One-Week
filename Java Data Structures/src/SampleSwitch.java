public class SampleSwitch {
    public static void main(String[] args)
    {
        for(int i=0; i<6; i++)
        {
            switch (i)
            {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                case 5:
                    System.out.println("i is five");
                    break;
                default:
                    System.out.println("Unkown value");
            }
        }
    }
}

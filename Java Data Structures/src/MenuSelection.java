public class MenuSelection {
    public static void main(String[] args) throws  java.io.IOException
    {
        char choice;

        //use do while to list the menu
        do{
            System.out.println("Help on sciences");
            System.out.println("  1. Biology");
            System.out.println("  2.Chemistry");
            System.out.println("  3.Physics");
            System.out.println("Choose one");
            choice = (char) System.in.read();
        }while(choice<'1' || choice>'3');

        System.out.println("\n");

        switch (choice)
        {
            case '1':
                System.out.println("Biology");
                System.out.println("Biolog is compsoed of botany and zoology");
                System.out.println("Botany is the study of plant");
                System.out.println("Zoology is the study of animals");
                break;
            case '2':
                System.out.println("Chemistry");
                System.out.println("Chemistry is the study of chemicals");
                break;

            case '3':
                System.out.println("Physics");
                System.out.println("Physics consist of mechanics and thermodynamcs and other more");
                System.out.println("Mechanics is the study of force revolving around bodies");
                System.out.println("Thermodynamics study of thermal properties of matter");
                break;
            default:
                System.out.println("The subject is not in the list");
        }
    }
}

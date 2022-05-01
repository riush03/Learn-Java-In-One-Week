public class King {
    //This program shows how constructors are executed
    King()
    {
        System.out.println("Inside the king's palace");
    }
}

class Queen extends King{
    Queen()
    {
        System.out.println("Inside the queen's palace");
    }
}
class Prince extends Queen{
    Prince()
    {
        System.out.println("Inside the prince's palace");
    }
}

class  CallingPrince{
    public static void main(String[] args)
    {
        Prince prince = new Prince();
    }
}

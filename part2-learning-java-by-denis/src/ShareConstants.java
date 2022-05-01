import java.util.Random;

public interface ShareConstants {
    int N0 = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;

}

class Question implements ShareConstants{
    Random rand = new Random();

    int ask()
    {
        int prob = (int) (100 * rand.nextDouble());
        if(prob<10)
            return N0; //30%
        else if(prob<60)
            return YES;
        else if(prob<75)
            return LATER;
        else if(prob<98)
            return SOON;

        else
            return NEVER;
    }
}

class AskMe implements ShareConstants{
    static void answer(int result)
    {
        switch (result)
        {
            case N0:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }

    public static void main(String[] args)
    {
        Question quiz = new Question();

        answer(quiz.ask());
        answer(quiz.ask());
        answer(quiz.ask());
        answer(quiz.ask());
    }
}
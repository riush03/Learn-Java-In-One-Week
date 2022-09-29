import java.awt.*;
import java.awt.event.*;

public class ATDemo extends Frame{
    //constructor
    public  ATDemo()
    {
        //use a flow layout
        Label one = new Label("One");
        Label two = new Label("two");
        Label three = new Label("Three");

        //add labels to the frame
        add(one);
        add(two);
        add(three);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args)
    {
        ATDemo windowApp = new ATDemo();

        windowApp.setSize(300,100);
        windowApp.setTitle("Windows App");
        windowApp.setVisible(true);
    }
}

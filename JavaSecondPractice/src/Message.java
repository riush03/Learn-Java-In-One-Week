import javax.swing.JOptionPane  ;

public class Message {


    private String message;

    public Message() {
    }

    public void startChat() {
        message = JOptionPane.showInputDialog("Enter a string:");
    }

    public void setMessage() {
        System.out.println(message);
    }

}

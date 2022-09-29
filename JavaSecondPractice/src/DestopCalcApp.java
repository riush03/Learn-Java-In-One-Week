import javax.swing.JOptionPane;

public class DestopCalcApp {
    public static void main(String[] args)
    {
        String fruits = JOptionPane.showInputDialog("Enter the number of fruits");
        int fruitsCount = Integer.parseInt(fruits);

        String vegetables = JOptionPane.showInputDialog("Enter the number of vegetables");
        int vegCount = Integer.parseInt(vegetables);

        int totalItemsCount = fruitsCount * vegCount;

        JOptionPane.showMessageDialog(null,"The total number if items is "+totalItemsCount);
        System.exit(0);
    }
}

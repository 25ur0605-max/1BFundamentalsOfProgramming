import javax.swing.JOptionPane;
public class Assignment1JOptionPane {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a year");

        if (input != null){
            int year = Integer.parseInt(input);

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                JOptionPane.showMessageDialog(null, year + " is a leap year");
            } else {
                JOptionPane.showMessageDialog(null, year + " is not a leap year");
            }

        }
    }
}

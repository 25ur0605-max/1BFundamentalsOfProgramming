import javax.swing.JOptionPane;
public class Prob1JOptionPane {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1: "));

        int highest = number;
        int lowest = number;

        for (int i = 2; i <= 10; i++) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter number " + i + ":"));

            if (number > highest) {
                highest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
        }

        JOptionPane.showMessageDialog(null, "Highest number: " + highest + "\nLowest number: " + lowest);

    }
}

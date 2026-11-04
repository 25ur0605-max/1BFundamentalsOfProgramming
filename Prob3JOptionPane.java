import javax.swing.JOptionPane;
public class Prob3JOptionPane {
    public static void main(String[] args) {
        double balance = 20000.00;
        double amount;

        while (true) {
            String input = JOptionPane.showInputDialog("Current balance: P" + String.format("%.2f", balance) + "\nEnter amount (0 to stop):");

                    if (input == null) {
                        break;
                    }

                    amount = Double.parseDouble(input);

                    if (amount == 0) {
                        break;
                    }

                    String message = "";

                    if (amount > 0) {
                        balance += amount;
                    }else if (amount < 0) {
                        if (balance + amount >= 0) {
                            balance += amount;
                        } else {
                            message = "INSUFFICIENT FUNDS!\n";
                        }
                    }

                    message += String.format("Outstanding balance: P%.2f", balance);

                    JOptionPane.showMessageDialog(null, message);
        }
        JOptionPane.showMessageDialog(null, "Program terminated.");

    }
}

import javax.swing.JOptionPane;
public class Assignment2JOptionPane {
    public static void main(String[] args) {
        String rateInput = JOptionPane.showInputDialog("Enter hourly pay rate (Php):");
        String hoursInput = JOptionPane.showInputDialog("Enter hours worked: ");

        if (rateInput != null && hoursInput != null ){
            double hourlyRate = Double.parseDouble(rateInput);
            double hoursWorked = Double.parseDouble(hoursInput);

            double grossPay = hourlyRate * hoursWorked;
            double taxRate;

            if (grossPay <= 2000) {
                taxRate = 0.10;
            } else if (grossPay <= 4000) {
                taxRate = 0.12;
            } else if (grossPay <= 10000) {
                taxRate = 0.15;
            } else {
                taxRate = 0.20;
            }

            double withholdingTax = grossPay * taxRate;
            double netPay = grossPay - withholdingTax;

            String msg = "Gross Pay: Php" + grossPay + "\n" +
                    "Withholding Tax: Php" + withholdingTax + "\n" +
                    "Net Pay: Php" + netPay + "\n";
            JOptionPane.showMessageDialog(null, msg);
        }

    }
}

import java.util.Scanner;
public class Assignment2Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly pay rate (Php): ");
        double hourlyRate = sc.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = sc.nextDouble();

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

            System.out.println();
            System.out.println("Gross Pay: Php" + grossPay);
            System.out.println("Withholding Tax: Php" + withholdingTax);
            System.out.println("Net Pay: Php" + netPay);

        }
    }


import java.util.Scanner;
public class Prob3Scanner {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       double balance = 20000.00;
       double amount;

       while (true) {
           System.out.print("Enter amount (0 to stop): ");
           amount = input.nextDouble();

           if (amount == 0) {
               break;
           }

           if (amount > 0) {
               balance += amount;
           }else if (amount < 0) {
               if (balance + amount >= 0) {
                   balance += amount;
               }else{
                   System.out.println("INSUFFICIENT FUNDS!");
               }
           }

           System.out.printf("Outstanding balance: P%.2f%n", balance);
       }

       System.out.println("Program terminated.");
    }
}

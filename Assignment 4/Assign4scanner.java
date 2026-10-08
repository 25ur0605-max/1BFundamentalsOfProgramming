import java.util.Scanner;
public class Assign4scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter citizenship code ('C' for citizen of Endor, 'N' for non-citizen): ");
        String citizenship = sc.next();

        System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
        String recommendee = sc.next();

        String status;

        if (recommendee.equalsIgnoreCase("R")) {
            status = "Accepted";
        } else if (height >= 200 && (age >= 21 && age <= 25) && citizenship.equalsIgnoreCase("C")) {
            status = "Accepted";
        }else {
            status = "Rejected";
        }

        System.out.println("Status: " + status);

    }
}
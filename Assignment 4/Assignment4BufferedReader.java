import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment4BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader readln = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height in cm: ");
        double height = Double.parseDouble(readln.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(readln.readLine());

        System.out.print("Enter citizenship code ('C' for citizen of Endor, 'N' for non-citizen): ");
        String citizenship = readln.readLine();

        System.out.print("Enter recommendee code ('R' for recommendee, 'N' for non-recommendee): ");
        String recommendee = readln.readLine();

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

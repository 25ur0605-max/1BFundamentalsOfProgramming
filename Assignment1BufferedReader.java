import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment1BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year: ");
        int year = Integer.parseInt(dataln.readLine());

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("is a leap year");
        } else {
            System.out.println("is not a leap year");
        }

    }
}

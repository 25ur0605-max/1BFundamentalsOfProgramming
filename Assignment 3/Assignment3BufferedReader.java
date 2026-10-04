import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Assignment3BufferedReader {
    public static void main(String[] args) throws IOException{
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = Double.parseDouble(dataln.readLine());

        System.out.print("Enter NSAT Score: ");
        double nsat = Double.parseDouble(dataln.readLine());

        System.out.print("Enter Entrance Exam Score: ");
        double examScore = Double.parseDouble(dataln.readLine());

        double averageScore = (nsat + examScore) / 2;
        String status;
         if (salary > 10000 || nsat < 90 || examScore < 85) {
             status = "Rejected";
         } else if (salary <= 3500 && averageScore >= 91 ) {
             status = "Accepted";
         }else {
             status = "Subjected for further study";
         }

        System.out.println("Application Status: " + status);
    }
}

import java.util.Scanner;
public class Assignment3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Parents' Monthly Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter NSAT Score: ");
        double nsat = sc.nextDouble();

        System.out.print("Enter Entrance Exam Score: ");
        double examScore = sc.nextDouble();

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

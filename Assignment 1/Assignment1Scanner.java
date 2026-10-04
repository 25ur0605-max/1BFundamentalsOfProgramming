import java.util.Scanner;
public class Assignment1Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("is a leap year");
        } else {
            System.out.println("is not a leap year");
        }

    }
}
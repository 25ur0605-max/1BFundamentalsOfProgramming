import java.util.Scanner;
public class Prob1Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");

        int number = input.nextInt();
        int highest = number;
        int lowest = number;

        for (int i = 2; i <= 10; i++) {
            number = input.nextInt();

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);

    }
}

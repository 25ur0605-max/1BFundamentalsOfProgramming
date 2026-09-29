import java.util.Scanner;
import java.util.InputMismatchException;

public class Activity5 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);

        try {
            System.out.print("Please enter your name: ");
            name = inputDevice.nextLine();

            System.out.print("Please enter your age: ");
            age = inputDevice.nextInt();

            System.out.println("Your name is " + name + " and you are " + age + " years old.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Age must be a whole number.");
        } finally {
            inputDevice.close();
        }
    }
}

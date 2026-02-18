import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeInputProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();

                if (age <= 0) {
                    System.out.println("Invalid input! Age must be greater than 0.");
                } else {
                    validInput = true; // valid age entered
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear the invalid input
            }
        }

        System.out.println("Your valid age is: " + age);

        scanner.close();
    }
}

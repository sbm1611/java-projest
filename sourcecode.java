import java.util.Scanner; // Import the Scanner class for user input

public class SimpleJavaProgram {

    // Method to print a greeting message
    public static void printGreeting() {
        System.out.println("Hello, welcome to the Simple Java Program!");
    }

    // Method to perform addition
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Main method - entry point of the Java application
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Print a greeting message
        printGreeting();

        // Prompt user for two numbers
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Perform addition using the addNumbers method
        int result = addNumbers(firstNumber, secondNumber);

        // Display the result
        System.out.println("The result of adding " + firstNumber + " and " + secondNumber + " is " + result + ".");

        // Close the scanner
        scanner.close();
    }
}
tst

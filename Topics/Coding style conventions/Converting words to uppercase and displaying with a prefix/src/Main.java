// import necessary libraries
import java.util.*;

public class Main {
    // Define a method that takes an input word and prints out the formatted output
    public static void printFormattedMessage(String input) {
        // Transform the input to upper case
            input = input.toUpperCase();
        // Print the desired output
        System.out.println("Watch: " + input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input word from the user
        String input = sc.nextLine();
        // Call the function to print formatted message
        printFormattedMessage(input);
    }
}
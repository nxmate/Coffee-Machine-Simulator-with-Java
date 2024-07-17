import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creating a Scanner object to read input from the user
        String name = scanner.nextLine();  // Reading the user's input and storing it in a variable called 'name'
        System.out.println("Hello, " + name + "!"); // Printing a greeting message with the user's name
    }
}
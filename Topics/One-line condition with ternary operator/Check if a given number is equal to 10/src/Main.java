    import org.w3c.dom.ls.LSOutput;

    import java.util.Scanner;  // Required to read user input

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read input
        int num = scanner.nextInt();

        // Put your code with ternary operator here
        if (num == 10) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // your code goes here
        int sum = num1 + num2;

        if(sum < 100) {
            System.out.println(sum);
        } else {
            System.out.println("That's a big sum!");
        }
    }
}
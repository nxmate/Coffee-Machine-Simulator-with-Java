import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();

        if ((-15 < input && input <= 12) || (14 < input && input < 17) || (19 <= input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
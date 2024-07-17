import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();

        if (input % 4 == 0 && input % 100 != 0 || input % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
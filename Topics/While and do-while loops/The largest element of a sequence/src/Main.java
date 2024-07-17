import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int value;
        int max = 0;
        while (true) {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
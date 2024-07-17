import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 0;
        int value;
        while (true) {
            value = scanner.nextInt();
            if (value == 0) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int totalNumbers = scanner.nextInt();
        int count = 0;
        int max = 0;

        while (count < totalNumbers) {
            int num = scanner.nextInt();
            if (num % 4 == 0 && num > max) {
                max = num;
            }
            count++;
        }
        System.out.println(max);
    }
}
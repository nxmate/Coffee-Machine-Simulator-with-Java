import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;

            for (int i = start; i <= end; i++) {
                if (i % n == 0) {
                    count++;
                }
            }
        System.out.println(count);
        scanner.close();
    }
}
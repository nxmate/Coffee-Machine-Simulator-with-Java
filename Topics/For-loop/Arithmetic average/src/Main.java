import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int count = 0;
        double sum = 0;

        for(int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }
        double average = sum / count;
        System.out.println(average);

        scanner.close();
    }
}
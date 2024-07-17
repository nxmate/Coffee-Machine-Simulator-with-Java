import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int elementsNum = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < elementsNum; i++) {
            int numbers = scanner.nextInt();
            if (numbers % 6 == 0) {
                sum += numbers;
            }
        }

        System.out.println(sum);
    }
}
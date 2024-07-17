import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        int desk1 = (group1 + 1) / 2;
        int desk2 = (group2 + 1) / 2;
        int desk3 = (group3 + 1) / 2;

        int totaldesks = desk1 + desk2 + desk3;

        System.out.println(totaldesks);
    }
}
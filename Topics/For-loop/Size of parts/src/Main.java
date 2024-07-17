import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();
        int ready = 0;
        int needToFix = 0;
        int reject = 0;

        for (int i = 0; i < n; i++) {
            int partStatus = scanner.nextInt();
            if (partStatus == 0) {
                ready++;
            } else if (partStatus == 1) {
                needToFix++;
            } else if (partStatus == -1) {
                reject++;
            }
        }
        System.out.println(ready + " " + needToFix + " " + reject);
    }
}
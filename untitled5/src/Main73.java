import java.util.Scanner;

public class Main73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int uniqueCount = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                uniqueCount++;
            }
        }

        System.out.println(uniqueCount);
        scanner.close();
    }
}
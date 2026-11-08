import java.util.Scanner;

public class Main71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int last = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + (i + 1 < n ? " " : ""));
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Main67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        boolean found = false;
        for (int i = 1; i < n; i++) {
            if ((a[i] > 0 && a[i - 1] > 0) || (a[i] < 0 && a[i - 1] < 0)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
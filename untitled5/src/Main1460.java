import java.util.Scanner;

public class Main1460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        k = (k % n + n) % n;

        if (k != 0) {
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i + 1 < n ? " " : ""));
        }

        scanner.close();
    }
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
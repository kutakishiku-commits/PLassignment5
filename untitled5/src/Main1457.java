import java.util.Scanner;

public class Main1457 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        reverse(arr, a - 1, b - 1);
        reverse(arr, c - 1, d - 1);
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
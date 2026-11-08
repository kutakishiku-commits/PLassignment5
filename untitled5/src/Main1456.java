import java.util.Scanner;

public class Main1456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        int petyaHeight = scanner.nextInt();
        int position = n + 1;
        for (int i = 0; i < n; i++) {
            if (height[i] < petyaHeight) {
                position = i + 1;
                break;
            }
        }

        System.out.println(position);
        scanner.close();
    }
}
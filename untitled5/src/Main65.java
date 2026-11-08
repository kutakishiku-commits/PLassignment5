import java.util.Scanner;

public class Main65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val > 0) {
                count++;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
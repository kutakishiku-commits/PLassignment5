import java.util.Scanner;

public class Main64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        boolean first = true;
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val % 2 == 0) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(val);
                first = false;
            }
        }

        scanner.close();
    }
}
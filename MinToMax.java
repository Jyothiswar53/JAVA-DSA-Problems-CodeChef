import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Test cases");
        int t = scanner.nextInt();

        while (t-- > 0) {
            System.out.println("Enter the Size of an Array");
            int n = scanner.nextInt();
            int[] a = new int[n];

            System.out.println("Enter elements into an Array");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int min = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == min) {
                    count++;
                }
            }

            System.out.println("The minimum number of operations required to make Maximum value :" + (n - count));
        }
        scanner.close();
    }
}
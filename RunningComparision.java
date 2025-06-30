// Running Comparison


// Alice and Bob recently got into running, and decided to compare how much they ran on different days.

// They each ran for N days — on the ith day, Alice ran Ai meters and Bob ran Bi meters.

// On each day,

// Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.

// Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.

// On how many of the N days were both Alice and Bob happy?


import java.util.Scanner;

public class RunningComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            int happyDays = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] <= 2 * b[i] && b[i] <= 2 * a[i]) {
                    happyDays++;
                }
            }
            System.out.println(happyDays);
        }
        scanner.close();

    }
}
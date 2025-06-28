/*MIN To MAX

You are given an array A consisting of N integers.

Let M be the minimum value present in the array initially.

You are allowed to perform the following operation any number of times:
	•	Choose any element A[i] in the array (1 ≤ i ≤ N)
	•	Replace it with any integer X, where (1 ≤ X ≤ 100)

 What is the minimum number of operations needed to achieve this?

*/

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

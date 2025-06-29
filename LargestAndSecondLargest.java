// Largest and Second Largest

// You are given an array A of N integers.
// Find the maximum sum of two distinct integers in the array.

// Note: It is guaranteed that there exist at least two distinct integers in the array.

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of test cases");
        int t = scanner.nextInt();

        while (t--> 0) {
            System.out.println("Enter the size of an Array");
            int n = scanner.nextInt();

            int[] a = new int[n];

            System.out.println("Enter Array elements");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (a[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = a[i];
                } else if (a[i] > secondMax && a[i] != firstMax) {
                    secondMax = a[i];
                }
            }

            int maxSum = firstMax + secondMax;
            System.out.println("The Max sum is :"+maxSum);
        }

        scanner.close();
    }
}
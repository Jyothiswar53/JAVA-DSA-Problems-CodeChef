// Find maximum in an Array

// Given a list of N integers, representing height of mountains. Find the height of the tallest mountain.


import java.util.*;

public class MaxInArray {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number of Test cases");
        int t = s.nextInt();

        while (t > 0) {
            System.out.println("Enter Size of an Array");
            int N = s.nextInt();

            int[] arr = new int[N];

            System.out.println("Enter elements into an Array");
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            int max = arr[0];

            for (int i = 1; i < N; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Maximum in an Array :"+max);
            t--;
        }
        s.close();
    }
}
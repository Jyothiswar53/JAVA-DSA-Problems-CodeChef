// Minimum number of Flips
  
// Chef has an array A of length N consisting of 1 and −1 only.

// In one operation, Chef can choose any index i(1≤i≤N) and multiply the element Ai by −1.

// Find the minimum number of operations required to make the sum of the array equal to 0. Output -1 if the sum of the array cannot be made 0.

// Input Format
  
// First line will contain 
// T, number of test cases. Then the test cases follow.
// First line of each test case consists of a single integer N denoting the length of the array.
// Second line of each test case contains N space-separated integers A1,A2,...,A denoting the array A.
  
// Output Format
// For each test case, output the minimum number of operations to make the sum of the array equal to 0. Output -1 if it is not possible to make the sum equal to 0.




import java.util.*;

class NumOfFlips{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            int ones = 0;
            int minusOnes = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 1) {
                    ones++;
                } else {
                    minusOnes++;
                }
                sum += arr[i];
            }

            if (n % 2 != 0) {
                System.out.println("-1");
            } else {
                System.out.println(Math.abs(ones - n / 2));
            }
        }
        sc.close();
    }
}

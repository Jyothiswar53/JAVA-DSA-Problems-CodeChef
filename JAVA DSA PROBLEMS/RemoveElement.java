// Remove Element

// You are given an array A=[A1,A2,…,AN] consisting of N positive integers.

// You are also given a constant K, using which you can perform the following operation on A:

// Choose two distinct indices i and j such that Ai+Aj≤K, and remove either Ai or Aj from A.
// Is it possible to obtain an array consisting of only one element using several (possibly, zero) such operations?




import java.util.*;

class RemoveElement
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of test cases : ");
        int t = s.nextInt();

        while (t--> 0) {
            System.out.println("Enter size of an Array : ");
            int n = s.nextInt();
            System.out.println("Enter the constant Value : ");
            int k = s.nextInt();
            int[] A = new int[n];

            System.out.println("Enter Array elements into an Array : ");
            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
            }

            if (n == 1) {
                System.out.println("Yes it is possible to obtain an array consisting of only one element");
                continue;
            }
            Arrays.sort(A);
            
            if ((A[0] + A[n - 1]) <= k) {
                System.out.println("Yes it is possible to obtain an array consisting of only one element");
            } else {
                System.out.println("No it is possible to obtain an array consisting of only one element");
            }

        }
        s.close();
    }
}
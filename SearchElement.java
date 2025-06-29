// Search an element in an array

// You are given an array A of size N and an element X. Your task is to find whether the array A contains the element X or not.


import java.util.*;

public class SearchElement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array size");
        int N = scanner.nextInt();

        System.out.println("Enter element to search");
        int X = scanner.nextInt();

        System.out.println("Enter Array elements");
        boolean found = false;
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            if(A == X){
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();

    }
}
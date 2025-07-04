// Difficulty Rating Order


// Our Chef has some students in his coding class who are practicing problems. Given the difficulty of the problems that the students have solved in order, help the Chef identify if they are solving them in non-decreasing order of difficulty. Non-decreasing means that the values in an array is either increasing or remaining the same, but not de d1 , and then later a problem with difficulty d2 , where d1 > d2.


// Output “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not.



import java.util.Scanner;

public class DifficultyRatingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] d = new int[n];

            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt();
            }

            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (d[i] > d[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
        scanner.close();
    }
}
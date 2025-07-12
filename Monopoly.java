// Monopoly

// There are 4 companies in the markets of Chefland, A, B, C, and D.
// This year,

//     Company A made a profit of P lakh rupees,
//     Company B made a profit of Q lakh rupees,
//     Company C made a profit of R lakh rupees,
//     Company D made a profit of S lakh rupees.
// There is said to be a monopoly in the market if the profit made by one company is strictly greater than the sum of profits made by all other companies.
// Determine if there is a monopoly in the market or not.



import java.util.*;

class Monopoly {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of test cases : ");
        int t = s.nextInt();

        while (t-- > 0) {
            System.out.println("Enter profit made by Company A : ");
            int P = s.nextInt();

            System.out.println("Enter profit made by Company B : ");
            int Q = s.nextInt();

            System.out.println("Enter profit made by Company C : ");
            int R = s.nextInt();

            System.out.println("Enter profit made by Company D : ");
            int S = s.nextInt();

            if (P > (Q + R + S)) {
                System.out.println("YES");
            } else if (Q > (P + R + S)) {
                System.out.println("YES");
            } else if (R > (Q + P + S)) {
                System.out.println("YES");
            } else if (S > (Q + R + P)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        s.close();
    }
}
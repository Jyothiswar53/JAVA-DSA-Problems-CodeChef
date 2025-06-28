// Cost of Groceries

// Chef visited a grocery store to buy fresh supplies. In the store, there are N different items available for sale.

// Each item has:
// 	•	A freshness value represented by an integer A[i]
// 	•	A cost represented by an integer B[i]

// Chef only wants to purchase the items that are fresh enough, meaning their freshness value is greater than or equal to a given value X.


// Calculate the total cost Chef has to pay to buy all the items that meet the freshness requirement.



import java.util.Scanner;

public class CostOfGroceries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Test cases");
        int t = scanner.nextInt();

        while (t-- > 0) {
            System.out.println("Enter Number of Items");
            int n = scanner.nextInt();

            System.out.println("Minimum freshness Chef wants");
            int x = scanner.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            System.out.println("Enter Freshness array elements");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            System.out.println("Read cost values");
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }

            int TotalCost = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] >= x) {
                    TotalCost += b[i];
                }
            }
            System.out.println("The total cost of the groceries Chef buys :"+TotalCost);
        }
        scanner.close();
    }
}

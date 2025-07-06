// Sale Season

// It's the sale season again and Chef bought items worth a total of X rupees. The sale season offer is as follows:

//    if X≤100, no discount.
//    if 100<X≤1000, discount is 25 rupees.
//    if 1000<X≤5000, discount is 100 rupees.
//    if X>5000, discount is 500 rupees.

// Find the final amount Chef needs to pay for his shopping.



import java.util.*;

class SalesSeason {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number of test cases");
        int t = s.nextInt();
        while (t-- > 0) {
            System.out.println("Enter Total Rupees :");
            int X = s.nextInt();

            if (X <= 100) {
                System.out.println("The Total Amount Chef pays for his shopping :" + X);
            } else if (X >= 100 && X <= 1000) {
                System.out.println("The Total Amount Chef pays for his shopping :" + (X - 25));
            } else if (X >= 1000 && X <= 5000) {
                System.out.println("The Total Amount Chef pays for his shopping :" + (X - 100));
            } else {
                System.out.println("The Total Amount Chef pays for his shopping :" + (X - 500));
            }
        }
        s.close();
    }
}
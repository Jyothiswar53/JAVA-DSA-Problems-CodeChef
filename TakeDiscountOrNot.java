// Take discount or Not


// There are N items in a shop. You know that the price of the i-th item is Ai. Chef wants to buy all the N items.

// There is also a discount coupon that costs X rupees and reduces the cost of every item by Y rupees. If the price of an item was initially ≤Y, it becomes free, i.e, costs 0.

// Determine whether Chef should buy the discount coupon or not. Chef will buy the discount coupon if and only if the total price he pays after buying the discount coupon is strictly less than the price he pays without buying the discount coupon.



import java.util.*;

class TakeDiscountOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Test cases");
        int t = sc.nextInt();

        while (t--> 0) {
            System.out.println("Enter Number of Items in the Shop");
            int N = sc.nextInt();

            System.out.println("Cost of Discount COUPON");
            int X = sc.nextInt();

            System.out.println("The amount each item’s price will reduce by if the coupon is used.");
            int Y = sc.nextInt();

            int[] price = new int[N];
            int totalWithoutCoupon = 0;
            int totalWithCoupon = X;

            System.out.println("Enter Prices");
            for (int i = 0; i < N; i++) {
                price[i] = sc.nextInt();
                totalWithoutCoupon += price[i];


                if (price[i] <= Y) {
                    totalWithCoupon += 0;
                } else {
                    totalWithCoupon += (price[i] - Y);
                }
            }

            if (totalWithCoupon < totalWithoutCoupon) {
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
        sc.close();
    }
}
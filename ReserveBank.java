import java.util.*;

class ReserveBank {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Test cases :");
        int t = sc.nextInt(); 

        while (t-- > 0) {
            System.out.println("Enter Total number of days : ");
            long D = sc.nextLong(); 

            System.out.println("Enter interval in days after which the rate increases : ");
            long d = sc.nextLong();

            System.out.println("Enter Initial rate : ");
            long P = sc.nextLong();

            System.out.println("Enter increase in rate every "+d+" days : ");
            long Q = sc.nextLong(); 

            long numIntervals = D / d; 
            long remainingDays = D % d; 

            long totalMoney = 0;

            totalMoney += (numIntervals * (2 * P + (numIntervals - 1) * Q) * d) / 2;

            totalMoney += remainingDays * (P + numIntervals * Q);

            System.out.println("The amount of money they will be able to print in the given period : "+totalMoney);
        }
        sc.close();
    }
}

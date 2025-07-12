// Chef is planning a heist in the reserve bank of Chefland. They are planning to hijack the bank for D days and print the money. The initial rate of printing the currency is P dollars per day and they increase the production by Q dollars after every interval of d days. For example, after d days the rate is P+Q dollars per day, and after 2d days the rate is P+2Q dollars per day, and so on. Output the amount of money they will be able to print in the given period.



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

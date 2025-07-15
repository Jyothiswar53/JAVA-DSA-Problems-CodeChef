import java.util.*;

class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of Test cases : ");
        int t = sc.nextInt();
        while (t--> 0) {
            System.out.println("Enter the Number to reverse : ");
            int n = sc.nextInt();
            int reversed_num = 0;

            while (n > 0) {
                int last_digit = n % 10;
                reversed_num = reversed_num * 10 + last_digit;
                n = n / 10;
            }

            System.out.println("After Reversing the Number : "+reversed_num);
        }
        sc.close();
    }
}

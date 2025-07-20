// Primality Test

// Alice and Bob are meeting after a long time. As usual they love to play some math games. This times Alice takes the call and decides the game. The game is very simple, Alice says out an integer and Bob has to say whether the number is prime or not. Bob as usual knows the logic but since Alice doesn't give Bob much time to think, so Bob decides to write a computer program.

// Help Bob accomplish this task by writing a computer program which will calculate whether the number is prime or not.

// Note that 1 is not a prime number.

// Input
// The first line of the input contains an integer T, the number of testcases. T lines follow.

// Each of the next T lines contains an integer N which has to be tested for primality.

// Output
// For each test case output in a separate line, "yes" if the number is prime else "no."



import java.util.Scanner;

class PrimeTest {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of test cases : ");
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

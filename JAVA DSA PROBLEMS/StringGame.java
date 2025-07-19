// String Game

// Zlatan and Ramos are playing a game on a binary string S of length N.
// Zlatan and Ramos make alternating moves with Zlatan going first.

// In one move, a player will:

// Select an index i(1≤i<N) such that Si≠Si+1 and delete both Si and Si+1 from the string S. Note that N gets reduced by 2 when both characters are deleted. If a player cannot select any such index i, he loses the game.
// Determine the winner of the game if both players play optimally.

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases.
// Each test case consists of multiple lines of input.
// The first line of each test case contains an integer N — the length of the binary string.
// The next line contains a binary string S of length N.
// Output Format
// For each test case, if Zlatan will win the game, output Zlatan. Otherwise, output Ramos.

// You can output each letter of the string in uppercase or lowercase. For example, Ramos, ramos, RAMOS, and rAmOS are all considered same.



import java.util.*;

class StringGame
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t--> 0) {
            int n = s.nextInt();
            String str = s.next();

            int zeros = 0;
            int ones = 0;

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }

            int moves = Math.min(zeros, ones);

            if (moves % 2 == 0) {
                System.out.println("Ramos");
            } else {
                System.out.println("Zlatan");
            }
        }
        s.close();
    }
}

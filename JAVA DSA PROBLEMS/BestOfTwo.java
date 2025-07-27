// Best of Two
  
// Alice and Bob are playing a game. Each player rolls a standard six-sided die three times. The score of a player is calculated as the sum of the two highest rolls. The player with the higher score wins. If both players have the same score, the game ends in a tie.

// Determine the winner of the game or if it is a tie.

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases.
// Each test case contains six space-separated integers A1,A2,A3,B1,B2 and B3 — the values Alice gets in her 3 dice rolls, followed by the values which Bob gets in his 3 dice rolls.
  
// Output Format
// For each test case, output on a new line Alice if Alice wins, Bob if Bob wins and Tie in case of a tie.
// Note that you may print each character in uppercase or lowercase. For example, the strings tie, TIE, Tie, and tIe are considered identical.




import java.util.*;

class BestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();

            int aliceScore = a1 + a2 + a3 - Math.min(a1, Math.min(a2, a3));
            int bobScore = b1 + b2 + b3 - Math.min(b1, Math.min(b2, b3));

            if (aliceScore > bobScore) {
                System.out.println("Alice");
            } else if (bobScore > aliceScore) {
                System.out.println("Bob");
            } else {
                System.out.println("Tie");
            }
        }
        sc.close(); 
    }
}

// Mighty Friend

// Motu and Tomu are very good friends who are always looking for new games to play against each other and ways to win these games. One day, they decided to play a new type of game with the following rules:

// The game is played on a sequence A0,A1,....,AN-1.

// The players alternate turns; Motu plays first, since he's earlier in lexicographical order.
// Each player has a score. The initial scores of both players are 0.
// On his turn, the current player has to pick the element of A with the lowest index, add its value to his score and delete that element from the sequence A.
// At the end of the game (when A is empty), Tomu wins if he has strictly greater score than Motu. Otherwise, Motu wins the game.
// In other words, Motu starts by selecting A0, adding it to his score and then deleting it; then, Tomu selects A1, adds its value to his score and deletes it, and so on.

// Motu and Tomu already chose a sequence A for this game. However, since Tomu plays second, he is given a different advantage: before the game, he is allowed to perform at most K swaps in A; afterwards, the two friends are going to play the game on this modified sequence.
// Now, Tomu wants you to determine if it is possible to perform up to K swaps in such a way that he can win this game.

// Input
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
// The first line of each test case contains two space-separated integers N and K denoting the number of elements in the sequence and the maximum number of swaps Tomu can perform.
// The second line contains N space-separated integers A0,A1,…,AN−1.
    
// Output
// For each test case, print a single line containing the string "YES" if Tomu can win the game or "NO" otherwise (without quotes).



import java.util.Scanner;
import java.util.Arrays;

class MotuAndTomuGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases :");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.println("Enter Size of the array :");
            int N = sc.nextInt();

            System.out.println("Enter Max number of swaps Tomu can make :");
            int K = sc.nextInt();
            int[] A = new int[N];

            System.out.println("Read the Array :");
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int motuCount = (N + 1) / 2;
            int tomuCount = N / 2;
            int[] motu = new int[motuCount];
            int[] tomu = new int[tomuCount];

            int mi = 0, ti = 0;
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    motu[mi++] = A[i];
                } else {
                    tomu[ti++] = A[i];
                }
            }

            for (int i = 0; i < motuCount - 1; i++) {
                for (int j = i + 1; j < motuCount; j++) {
                    if (motu[i] < motu[j]) {
                        int temp = motu[i];
                        motu[i] = motu[j];
                        motu[j] = temp;
                    }
                }
            }

            Arrays.sort(tomu);

            int swaps = Math.min(K, Math.min(motuCount, tomuCount));
            for (int i = 0; i < swaps; i++) {
                if (motu[i] > tomu[i]) {
                    int temp = motu[i];
                    motu[i] = tomu[i];
                    tomu[i] = temp;
                } else {
                    break;
                }
            }

            int motuScore = 0;
            for (int i = 0; i < motuCount; i++) {
                motuScore += motu[i];
            }
            int tomuScore = 0;
            for (int i = 0; i < tomuCount; i++) {
                tomuScore += tomu[i];
            }

            if (tomuScore > motuScore) {
                System.out.println("Tomu's Score is Greater than Motu's Score i.e : "+tomuScore);
            } else {
                System.out.println("Motu's Score is Greater than Tomu's Score i.e : "+motuScore);
            }
        }

        sc.close();
    }
}

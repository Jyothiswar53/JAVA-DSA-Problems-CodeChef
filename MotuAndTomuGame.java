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
// Chef and Candies

// There are N children and Chef wants to give them 1 candy each. Chef already has X candies with him. To buy the rest, he visits a candy shop. In the shop, packets containing exactly 4 candies are available.

// Determine the minimum number of candy packets Chef must buy so that he is able to give 1 candy to each of the N children.




import java.util.*;

class Candies
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Number of Test Cases :");
        int t = s.nextInt();

        while (t--> 0) {
            System.out.println("Enter Number of Children :");
            int N = s.nextInt();

            System.out.println("He Already have some Candies :");
            int X = s.nextInt();

            if (N <= X) {
                System.out.println(0);
            } else {
                int required = N - X;
                int packets = (required + 3) / 4;

                System.out.println("The minimum number of candy packets Chef must buy :"+packets);
            }
        }
        s.close();
    }
}
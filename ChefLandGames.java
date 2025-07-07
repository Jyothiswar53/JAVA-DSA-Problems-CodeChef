// Chefland Games

// In Chefland, a tennis game involves 4 referees.
// Each referee has to point out whether he considers the ball to be inside limits or outside limits. The ball is considered to be IN if and only if all the referees agree that it was inside limits.

// Given the decision of the 4 referees, help Chef determine whether the ball is considered inside limits or not.



// Chefland Games

// In Chefland, a tennis game involves 4 referees.
// Each referee has to point out whether he considers the ball to be inside limits or outside limits. The ball is considered to be IN if and only if all the referees agree that it was inside limits.

// Given the decision of the 4 referees, help Chef determine whether the ball is considered inside limits or not.



import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t--> 0) {
            System.out.println("Enter the Decision of First Referee :");
            int R1 = s.nextInt();

            System.out.println("Enter the Decision of Second Referee :");
            int R2 = s.nextInt();

            System.out.println("Enter the Decision of Third Referee :");
            int R3 = s.nextInt();

            System.out.println("Enter the Decision of Fourth Referee :");
            int R4 = s.nextInt();

            if (R1 == 0 && R2 == 0 && R3 == 0 && R4 == 0) {
                System.out.println("IN");
            } else {
                System.out.println("OUT");
            }
        }
        s.close();
    }
}

// Air Conditioner Temperature

// There are three people sitting in a room - Alice, Bob, and Charlie. They need to decide on the temperature to set on the air conditioner. Everyone has a demand each:

//     Alice wants the temperature to be at least A degrees.
//     Bob wants the temperature to be at most B degrees.
//     Charlie wants the temperature to be at least C degrees.
// Can they all agree on some temperature, or not?

// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases.
// Each test case consists of a single line which contains three integers - A,B,C.

// Output Format
// For each test case, output on a new line, "Yes" or "No". "Yes", if they can decide on some temperature which fits all their demands. Or "No", if no temperature fits all their demands.



import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t--> 0) {
            int aliceTemp = s.nextInt();
            int bobTemp = s.nextInt();
            int charlieTemp = s.nextInt();

            if (Math.max(aliceTemp, charlieTemp) <= bobTemp) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        s.close();
    }
}
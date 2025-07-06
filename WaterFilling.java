// Water Filling

// Chef has three water bottles. At any point, if at least two of them are empty, she will fill them up. But if at most one bottle is empty, she will wait, and not fill them up now.

// You are given three integers - B1,B2 and B3. 
// If B1=1,it means that the first bottle is full.
// If B1=0, it means that the first bottle is empty.
// Similarly, B2 denotes whether the second bottle is full or empty, and denotes it for the third bottle.

// Output : "Water filling time", if Chef has to fill the bottles now. If not, output "Not now".



import java.util.*;

class WaterFilling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number of test cases");
        int t = s.nextInt();

        while (t-- > 0) {
            System.out.println("Enter Bottle 1 status :");
            int b1 = s.nextInt();

            System.out.println("Enter Bottle 2 status :");
            int b2 = s.nextInt();

            System.out.println("Enter Bottle 3 status :");
            int b3 = s.nextInt();

            int emptyBottels = 0;
            if (b1 == 0) {
                emptyBottels++;
            }
            if (b2 == 0) {
                emptyBottels++;
            }
            if (b3 == 0) {
                emptyBottels++;
            }

            if (emptyBottels >= 2) {
                System.out.println("Water Filling Time");
            } else {
                System.out.println("Not Now");
            }
        }
        s.close();
    }
}
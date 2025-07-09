import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Test Cases :");
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println("Enter Number of Guests :");
            int n = sc.nextInt();
            int[] arrival = new int[n];
            int[] departure = new int[n];

            System.out.println("Read arrival times into an Array :");
            for (int i = 0; i < n; i++) {
                arrival[i] = sc.nextInt();
            }

            System.out.println("Read departure times into an Array :");
            for (int i = 0; i < n; i++) {
                departure[i] = sc.nextInt();
            }

            Arrays.sort(arrival);
            Arrays.sort(departure);

            int guestsInHotel = 0;
            int maxGuests = 0;
            int i = 0, j = 0;

            while (i < n && j < n) {
                if (arrival[i] < departure[j]) {
                    guestsInHotel++;
                    maxGuests = Math.max(maxGuests, guestsInHotel);
                    i++;
                } else {
                    guestsInHotel--;
                    j++;
                }
            }

            System.out.println("The maximum number of guests that are simultaneously at the hotel :"+maxGuests);
        }
        sc.close();
    }
}

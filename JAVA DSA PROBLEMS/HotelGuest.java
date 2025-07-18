// Hotel Bytelandia
    
// A holiday weekend is coming up, and Hotel Bytelandia needs to find out if it has enough rooms to accommodate all potential guests. A number of guests have made reservations. Each reservation consists of an arrival time, and a departure time. The hotel management has hired you to calculate the maximum number of guests that will be at the hotel simultaneously. Note that if one guest arrives at the same time another leaves, they are never considered to be at the hotel simultaneously (see the second example).

// Input
// Input will begin with an integer T, the number of test cases. Each test case begins with an integer N, the number of guests. Two lines follow, each with exactly N positive integers. The i-th integer of the first line is the arrival time of the i-th guest, and the i-th integer of the second line is the departure time of the i-th guest (which will be strictly greater than the arrival time).

// Output
// For each test case, print the maximum number of guests that are simultaneously at the hotel.



import java.util.*;

class HotelGuest {
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

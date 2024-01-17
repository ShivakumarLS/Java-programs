

import java.util.Arrays;

public class CorporateFlightBookings {

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int [n];
        for(int [] entry : bookings)
            {
               int start = entry[0],end=entry[1],seats=entry[2];
               result[start-1]+=seats;
               
               if(  end<n )
                    result[end] -=seats;
                
                System.out.println(Arrays.toString(result));
            }
            // handle the overlapping entries
            for(int i=1;i<n;i++)
                result[i]+=result[i-1];
        return result;
    }
    public static void main(String[] args) {
        int [] [] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int n=5;
        System.out.println(Arrays.toString(corpFlightBookings(bookings, n)));
    }

}

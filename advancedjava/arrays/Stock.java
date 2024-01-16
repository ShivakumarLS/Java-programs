package JavaPrograms.arrays;


public class Stock {

    public static int maxProfit(int[] prices) {
        int maxi=0,min  = prices[0],n = prices.length;
        for(int i=0;i<n;i++)
        {
            min = Math.min(min,prices[i]);
            maxi = Math.max(maxi,prices[i]-min);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] prices = { 7,1 };
        System.out.println(maxProfit(prices));
    }
}

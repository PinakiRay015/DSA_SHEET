//java program to find the maximum profit
package Array;

public class stocks {
    public static int getMaxProfit(int []prices)
    {
        int buyingPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1 ; i<prices.length ; i++)
        {
            if(buyingPrice < prices[i])
            {
                maxProfit = Math.max(prices[i] - buyingPrice , maxProfit);
            }
            else
            {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(prices));
    }
}

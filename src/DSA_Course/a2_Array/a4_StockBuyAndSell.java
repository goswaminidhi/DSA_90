package DSA_Course.a2_Array;

public class a4_StockBuyAndSell {
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            //1 way
            profit = Math.max(profit,prices[i] - min);
           min = Math.min(prices[i],min);
           //Another way of writing the same code
//            if(prices[i] - min > profit){
//                profit = prices[i] - min;
//            }
//            if(prices[i] < min){
//                min = prices[i];
//            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}

public class solution_1_buySellStock {
    public static int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int profit = 0;
        int high_profit = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<low)
                low =prices[i];
            profit = prices[i] - low;
            if(profit > high_profit && profit >0)
            {
                high_profit = profit;
                
            }
                
        }
       
        
        return (high_profit != Integer.MIN_VALUE)?high_profit:0;
    }
    public static void main(String[] args)
    {
        int[] example1 = {7,1,5,3,6,4};
        int[] example2 = {7,6,4,3,1};

        int result1 = maxProfit(example1);
        int result2 = maxProfit(example2);

        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);
    }
}

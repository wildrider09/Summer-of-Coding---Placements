class Solution {
    public int maxProfit(int[] prices) {
  
        int n=prices.length,profit=0,min_value=prices[0];
        for(int i=1;i<n;i++)
        { 
            if(prices[i]-min_value>profit)
                profit=prices[i]-min_value;
            
            else if(prices[i]<min_value)
                min_value=prices[i];
                
        }
        return profit;
        
    }
}

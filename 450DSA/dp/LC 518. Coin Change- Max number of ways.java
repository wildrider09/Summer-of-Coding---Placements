class Solution {
    public int change(int amount, int[] coins) {
        if(amount == 0) return 1;
        return getCoin(coins, coins.length, amount);
    }
    
    static int getCoin(int[] arr,int n, int sum){
        
        if(n == 0 || sum == 0) return 0;
        
        int[][] dp = new int[n+1][sum+1];
        
        for(int i = 0; i <= n; ++i){
            for(int j = 0; j <= sum; ++j){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 1;
                
            }
        }
        for(int i = 1; i <=n; ++i){
            for(int j = 1; j <= sum; ++j){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }       
        return dp[n][sum];
    }
    
}
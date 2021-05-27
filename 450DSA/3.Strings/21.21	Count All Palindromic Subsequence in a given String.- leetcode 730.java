class Solution
{
    long[][] dp = new long[1002][1002];
    int mod=(int)1e9+7;
    long countPS(String str)
    {
      for(int i=0;i<str.length();i++)
        Arrays.fill(dp[i],-1);
      return countPS1(str,0,str.length()-1);
        
    }
    
    
     long countPS1(String str,int i, int j)
    {
 
        if (i > j)
            return 0;

	if (i == j)
            return 1;
  		
        if (dp[i][j] != -1)
            return dp[i][j];
     
        
        else if (str.charAt(i) == str.charAt(j))
            return dp[i][j]= (1+ countPS1(str,i + 1, j) + countPS1(str,i, j - 1))%mod;
 
        else
           {
               dp[i][j] = (countPS1(str,i + 1, j) + countPS1(str,i, j - 1)
                           - countPS1(str,i+1, j - 1))%mod;
               if(dp[i][j]<0)
                dp[i][j]+=mod;
               return dp[i][j];
           }
    }
}

class Solution{
    static String longestPalin(String s){
        // code here
         boolean dp[][]=new boolean[s.length()][s.length()];
        String len="";
        int i,g,j,n=s.length();
        char X[]=s.toCharArray();
        
        for(g=0;g<n;g++)
        {
            for(i=0,j=g;j<n;i++,j++)
            {
                if(g==0)
                    dp[i][j]=true;
                
                else if(g==1)
                {
                    if(X[i]==X[j])
                        dp[i][j]=true;
                    else
                        dp[i][j]=false;
                }
                
                else
                {
                    if(X[i]==X[j] && dp[i+1][j-1]==true)
                        dp[i][j]=true;
                        
                    else
                        dp[i][j]=false;
                }
                    
                if(dp[i][j] && (j+1-i)>len.length())
                    len=s.substring(i,j+1);
                
             }
         }
        
        return len;
        
        
    }

}

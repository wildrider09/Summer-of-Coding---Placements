//memoiz 


class Solution{
    // function to find LCS
    static int t[][]=new int[1001][1001];
    
    static int lcs(int p, int q, String s1, String s2){
    
        // your code here
        for(int i=0;i<=p;i++)
            Arrays.fill(t[i],-1);
        return lcsc(p,q,s1,s2);
    }
    
        
    static int lcsc(int p, int q, String s1, String s2){
    
        // your code here
        if(p==0||q==0)
            return 0;
        if(t[p][q]!=-1)
            return t[p][q];
        if(s1.charAt(p-1)==s2.charAt(q-1))
            return t[p][q]= 1 + lcsc(p-1,q-1,s1,s2);
        else
            return t[p][q]=Math.max(lcsc(p,q-1,s1,s2) , lcsc(p-1,q,s1,s2));
        
        }
}

//top-down
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp[][]=new int[1002][1002];
        for(int i=0;i<=x;i++)
            for(int j=0;j<=y;j++)
                if(i==0 || j==0)
                    dp[i][j]=0;
            
        
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]= 1+ dp[i-1][j-1];
                    
                else
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        
        
        return dp[x][y];
        
    }

    
}
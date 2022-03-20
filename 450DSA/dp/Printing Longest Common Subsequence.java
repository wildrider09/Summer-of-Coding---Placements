  
class  LongestCommonSubsequence
{
    // Returns length of LCS for X[0..m-1], Y[0..n-1]
    static void lcs(String X, String Y, int m, int n)
    {
        int[][] t = new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }
        
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(X.charAt(i-1)==Y.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }
        
        String s="";
        int i=m,j=n;
        while(i>0 && j>0)
        {
                if(X.charAt(i-1)==Y.charAt(j-1))
                {
                    s=X.charAt(i-1)+s;
                    i--;j--;
                }
                else
                {
                    if(t[i-1][j]>t[i][j-1])
                    { 
                      i--;      
                    }
                    else
                    {
                      j--;
                    }
                }
        }
        System.out.println(s);
    }
      
    // driver program
    public static void main (String[] args) 
    {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int m = X.length();
        int n = Y.length();
        lcs(X, Y, m, n);
    }
}
  
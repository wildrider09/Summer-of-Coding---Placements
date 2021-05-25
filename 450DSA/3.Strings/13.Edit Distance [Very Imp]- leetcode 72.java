class Solution {
    public int editDistance(String s, String x) {
        
        
        // Code here
        
        int m=s.length();
        int n=x.length();
        
        int t[][]=new int [101][101];
        for(int i=0;i<m+1;i++)
            t[i][0]=i;
        for(int i=0;i<n+1;i++)
            t[0][i]=i;
        
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(s.charAt(i-1)==x.charAt(j-1))
                    t[i][j]=t[i-1][j-1];
                else
                   {
                       t[i][j]=1+Math.min(Math.min(t[i-1][j],t[i][j-1]),t[i-1][j-1]);
                    }
            }
        }
        
        return t[m][n];
    }
}

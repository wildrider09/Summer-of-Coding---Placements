
class Solution{
    int longestCommonSubstr(String s1, String s2, int p, int q){
        
        int t[][]=new int[p+1][q+1];
    
        for(int i=0;i<=p;i++)
            for(int j=0;j<=q;j++)
                if(i==0||j==0)
                    t[i][j]=0;
        int res=0;
        for(int i=1;i<=p;i++)
            {
                for(int j=1;j<=q;j++)
                { 
                    if(s1.charAt(i-1) == s2.charAt(j-1))
                        {
                            t[i][j]= 1 + t[i-1][j-1];
                            res=Math.max(res,t[i][j]);
                        }
                    else
                         t[i][j]=0;
                }
            }
        return res;
    
    }
}
//memoiz
class Solution 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int t[][]=new int[1002][1002];
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         for(int i=0;i<1002;i++)
            Arrays.fill(t[i],-1);
            
         return kp(W,wt,val,n);
    }
    static int kp(int W, int wt[], int val[], int n) 
    {
        if(n==0 || W==0)
          return 0;
         if(t[n][W]!=-1)
          return t[n][W];
         if(wt[n-1]<=W)
          return t[n][W]=Math.max(val[n-1]+kp(W-wt[n-1], wt, val, n-1) ,kp(W, wt, val, n-1) );
         else 
          return t[n][W]=kp(W, wt, val, n-1) ;
          
    } 
}



//top down
class Solution 
{ 
      // Returns the maximum value that can be put in a knapsack of capacity W 
    static int t[][]=new int[1002][1002];
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
        
         for(int i=0;i<=n;i++)
            for(int j=0;j<=W;j++)
                if(i==0 || j==0)
                    t[i][j]=0;
         
         for(int i=1;i<n+1;i++)
            {
                for(int j=1;j<W+1;j++)
                {
                    if(wt[i-1]<=j)
                       t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                    else
                       t[i][j]=t[i-1][j];
                }   
            }    
            
         return t[n][W];
    }  
}



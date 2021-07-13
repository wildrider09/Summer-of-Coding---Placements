class Solution {
    
    static ArrayList<String> list;

    public static ArrayList<String> findPath(int[][] m, int n) {
        
        list= new ArrayList<String>();
        boolean dp[][]=new boolean[n][n];
        
        if(m[0][0]==1)
        {
            dp[0][0]=true;
            func(m,dp,"",0,0,n);
        }
        
        if(list.size()==0)
            list.add("-1");
        
        return list;
    }
    
    static void func(int [][]m,boolean dp[][],String ans,int row,int col,int n)
    {
        if(row==n-1 && col==n-1)
        {
            list.add(ans);
        }
        
        if(row+1<n && m[row+1][col]==1 && dp[row+1][col]==false){
                
            dp[row+1][col]=true;
            func(m,dp,ans+"D",row+1,col,n);
            dp[row+1][col]=false;
        }
        
        if(col-1>=0 && m[row][col-1]==1 && dp[row][col-1]==false){
                
            dp[row][col-1]=true;
            func(m,dp,ans+"L",row,col-1,n);
            dp[row][col-1]=false;
        }
        
        if(col+1<n && m[row][col+1]==1 && dp[row][col+1]==false){
                
            dp[row][col+1]=true;
            func(m,dp,ans+"R",row,col+1,n);
            dp[row][col+1]=false;
        }
        
        if(row-1>=0 && m[row-1][col]==1 && dp[row-1][col]==false){
                
            dp[row-1][col]=true;
            func(m,dp,ans+"U",row-1,col,n);
            dp[row-1][col]=false;
        }
        
    }
}

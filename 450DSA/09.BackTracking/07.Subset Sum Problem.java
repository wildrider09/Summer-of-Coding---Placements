//memoiz
class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum=0;        
        for(int i:arr)    sum+=i;
	if(sum%2==1)      return 0;

	int dp[][]=new int[100][sum+1];
        for(int i=0;i<N;i++)
            Arrays.fill(dp[i],-1);
        
        return func(arr,dp,sum/2,0,0);
    }
    
    static int func(int arr[],int dp[][], int target,int current,int pos)
    {
        if(target==current)
            return 1;
            
        if(target<current || pos==arr.length)
            return 0;
        
        if(dp[pos][current]!=-1)
            return dp[pos][current];
            
        dp[pos][current]= func(arr,dp,target,current+arr[pos],pos+1) |
                          func(arr,dp,target,current,pos+1);
        
        return dp[pos][current];
    }
}

//topdown
class Solution{
    static int equalPartition(int N, int arr[])
    {
        int i=0,j=0,sum=0;
        
        for(i=0;i<N;i++)
            sum+=arr[i];
        
        if(sum%2!=0)
            return 0;
        
        N=sum/2;
        int t[][]=new int[102][100002];
        
        for( j = 0 ; j< N+1 ; j++) t[0][j] = 0;
        for( i = 0 ; i< arr.length+1 ; i++) t[i][0] = 1;
            
        for( i=1;i< arr.length+1;i++)
            {
                for( j=1;j< N+1;j++)
                {
                    if(arr[i-1]<=j)
                        t[i][j]= t[i-1][j-arr[i-1]] | t[i-1][j] ;
                    else
                        t[i][j]= t[i-1][j] ;
                    
                }
            }
            
        return t[arr.length][N];
        
    }
}

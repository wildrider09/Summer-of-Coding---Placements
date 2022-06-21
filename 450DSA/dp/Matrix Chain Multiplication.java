
class Solution{
    
    static int t[][]=new int [502][502];
    
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<502;i++)
            Arrays.fill(t[i],-1);
        
        return MCM(arr,1,N-1,ans);
        
    }
    static int MCM(int arr[],int i,int j,int ans)
    {
        if(i>=j)
            return 0;
        if(t[i][j]!=-1)
            return t[i][j];
        for(int k=i;k<j;k++)
        {
            int temp=MCM(arr,i,k,ans)+MCM(arr,k+1,j,ans);
            int cost=arr[i-1]*arr[k]*arr[j];
            ans=Math.min(ans,temp+cost);
        }
        
        t[i][j]=ans;
        
        return ans;
            
    }
}


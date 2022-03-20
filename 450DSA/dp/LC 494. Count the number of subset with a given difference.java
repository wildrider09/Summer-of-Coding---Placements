class Solution {
    public int findTargetSumWays(int[] arr, int S) {
     
        int sum=0;
        int zc=0;
        Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++)
        { 
            if(arr[i]==0)
                zc++;
            sum+=arr[i];
        }
	    
	    int t[][]=new int[arr.length+1][sum+1];
	    
	    for(int j=0;j<sum+1;j++)
	        t[0][j]=0;
	    
	    for(int j=0;j<arr.length+1;j++)
	        t[j][0]=1;
	    
	    for(int i=1;i<arr.length+1;i++)
	        {
	            for(int j=1;j<sum+1;j++)
	            {
	                if(arr[i-1]<=j)
	                    t[i][j]=t[i-1][j] + t[i-1][j-arr[i-1]];
	                else
	                    t[i][j]=t[i-1][j];
	            }
	        }
	   int count=0;
	   for(int i=(sum-S)/2;i>=0;i--)
	        {
	            if(t[arr.length][i]>0)
	                {
	                    if(sum-(2*i) == S)
	                        count+=t[arr.length][i];
	                }
	        }
        count*=(Math.pow(2,zc));
        return count;	        
	 }
}

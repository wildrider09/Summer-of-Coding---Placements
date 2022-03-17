
class Solution
{

	public int minDiffernce(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    
	    for(int i=0;i<arr.length;i++)
	        sum+=arr[i];
	    
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
	                    t[i][j]=t[i-1][j] | t[i-1][j-arr[i-1]];
	                else
	                    t[i][j]=t[i-1][j];
	            }
	        }
	        
	   for(int i=sum/2;i>=0;i--)
	        {
	            if(t[arr.length][i]==1)
	                return sum-(2*i);
	        }
	        
	        return 0;
	        
	} 
}
class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    int list[]=new int[n];
	    int max=arr[0];
	    
	    for(int i=0;i<n;i++)
	        list[i]=arr[i];
	        
	    for(int i=1;i<n;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            if(arr[i]>arr[j] && arr[i]+list[j]>list[i])
	            {
	                list[i]=arr[i]+list[j];
	                max=Math.max(max,list[i]);
	            }
	        }
	    }
	    
	    return max;
	}  
}

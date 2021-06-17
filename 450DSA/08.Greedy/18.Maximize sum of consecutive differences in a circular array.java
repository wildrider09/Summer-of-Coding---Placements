class GFG
{
    long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
	    long max=0;
	    int i=0,j=n-1,count=0;
	    
	    while(i<=j)
	    {   
	        if(count++%2==0)
	        {
	            max+=Math.abs(arr[i]-arr[j]);
	            i++;
	        }
	        else
	        {
	            max+=Math.abs(arr[i]-arr[j]);
	            j--;
	        }
	    }
	    
	    max+=Math.abs(arr[0]-arr[n/2]);
    	return max;
    }
}

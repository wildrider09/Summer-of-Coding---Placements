class Solution{

    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        // Your code here
        int max=arr[n-1]+1;
        int k=n-1,s=0;
        // for 1 2 3 4 5 6
        //  43 9 37 18 32 27
        // to remember the two numbers we will use the approach k=a+b*(max+1);
        // recover num a=k%(max+1) and b=k/(max+1)

        for(int i=0;i<n;i++)
	{

     	    if(i%2==0)
                arr[i]=arr[i]+(arr[k--]%max)*max;
            else
                arr[i]=arr[i]+(arr[s++]%max)*max;
            
        }

        for(int i=0;i<n;i++)  
            arr[i]/=max;
    }
}

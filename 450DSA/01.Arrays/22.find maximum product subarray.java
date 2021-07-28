class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long max=arr[0],min=arr[0],ans=arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]<0)
            {
                long t=min;
                min=max;
                max=t;
            }
            
            max=Math.max(max*arr[i],arr[i]);
            min=Math.min(min*arr[i],arr[i]);
            
            ans=Math.max(max,ans);
        }
        
        return ans;
    }
}

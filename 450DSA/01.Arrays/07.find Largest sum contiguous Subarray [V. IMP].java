class Solution{

    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int result=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            if(sum<0)
                sum=0;
            sum+=arr[i];
            result=Math.max(arr[i],sum);
            ans=Math.max(ans,result);
        }
        
        return ans;
    }
    
}

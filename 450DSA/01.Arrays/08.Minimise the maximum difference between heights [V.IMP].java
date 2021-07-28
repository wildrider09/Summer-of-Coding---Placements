class Solution {
    int getMinDiff(int[] arr, int n, int k) {
       
        Arrays.sort(arr);
        int diff=arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]>=k)
            {
                int max=Math.max(arr[i-1]+k,arr[n-1]-k);
                int min=Math.min(arr[i]-k,arr[0]+k);
                
                diff=Math.min(diff,max-min);
            }
        }
        return diff;
    }
}

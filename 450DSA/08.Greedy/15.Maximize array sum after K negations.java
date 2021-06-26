class Solution {

    public static long maximizeSum(long arr[], int n, int k)
    {
        // Your code goes here
        Arrays.sort(arr);
        int i;
        long sum=0,count=0,min=Integer.MAX_VALUE;
        
        
        for(i=0;i<n;i++)
        {
            if(k > 0 && arr[i]<0)
            {
                k--;
                arr[i]=-arr[i];
                sum+=arr[i];
            }
            else
                sum+=arr[i];
        }
        
        if(k%2==0)
            return sum;
        else
        {
            for(long t:arr)
            {
                if(min>t)
                    min=t;
            }
            return sum-(2*min);
        }
    }
}

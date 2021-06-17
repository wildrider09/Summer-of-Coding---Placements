class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        long arr[]=a.stream().mapToLong(Long::intValue).toArray();
        Arrays.sort(arr);
        
        long window=0,min;
        
        for(int i=0;i<m;i++)
            window+=arr[i];
            
        min=arr[(int)m-1]-arr[0];
        
        for(int i=1;i<=n-m;i++)
        {
            window=arr[(int)m + i -1] - arr[i];
            min=Math.min(min,window);
        }
        return min;
    }
}

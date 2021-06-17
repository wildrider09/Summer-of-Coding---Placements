class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        Arrays.sort(arr);
        long sum=0,mod=(long)1e9+7;
        
        for(int i=0;i<arr.length;i++)
        {
            sum= (sum+((long)arr[i]*i)%mod)%mod;
        }
        return (int)sum;
    }   
}




public class Solution {
	public static long maxProductSubset(int[] arr, int n) {
		 
      
    int maxneg = Integer.MIN_VALUE ;
    int negcnt = 0, zerocnt = 0;
    long prod = 1;
    int mod = (int)1e9+7;

    for(int i = 0; i < n; i++)
    {
        if(arr[i]==0) zerocnt++;
        
        if (arr[i] < 0) 
         {
            negcnt++;
            maxneg = Math.max(maxneg , arr[i]);
        }
    }
        
    if ((negcnt == 1 && zerocnt == n-1) ||  zerocnt == n)
            return 0;
        
    
    for (int i = 0; i < n; i++) 
    {
        if (arr[i] == 0) 
            continue; 
        if(negcnt % 2 == 1 && arr[i] == maxneg)
            prod = prod * 1;
        else
            prod = ((prod*arr[i])%mod +mod)%mod;
     }
    
    return prod;
	
   }
}

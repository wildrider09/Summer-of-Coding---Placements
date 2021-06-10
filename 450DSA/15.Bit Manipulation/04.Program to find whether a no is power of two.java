class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        int count=0;
        while(n>0)
        {
            if( (n & 1) > 0)
                count++;
            n=n>>1;
        }
        if(count==1)
            return true;
        else
            return false;
        
    }
    
    
}

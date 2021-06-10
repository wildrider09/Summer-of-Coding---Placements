class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        if(n<1)
            return 0;
        if(n==1)
            return 1;
        
        int x=(int)Math.floor(Math.log(n)/Math.log(2));
        
        int count=x*(int)Math.pow(2,x-1);
        int count1= n -(int)Math.pow(2,x);
        
        return count+ (count1+1) + countSetBits(count1);
        
        
    }
}

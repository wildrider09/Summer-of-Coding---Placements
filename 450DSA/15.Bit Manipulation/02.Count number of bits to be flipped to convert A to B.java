class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        
        int flip=0;
        
        while(a>0 || b>0)
        {
            if((a&1)!=(b&1))
                flip++;
                
            a=a>>1;
            b=b>>1;
        }    
        
        return flip;
    
        
    }   
}

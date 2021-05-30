class Solution
{
    public int[] singleNumber(int[] nums)
    {
        int x=0,pos=0;
        int t1=0,t2=0;
        
        for(int i :nums)
            x=x^i;
        
        while(x>0)
        {
            if( (x & 1)==0)
            {
                pos++;
                x=x>>1;
            }
            else
                break;
        }
        
        
         for(int i :nums){
             
            if((i & (1<<pos)) >0)
                t1=t1^i;
            else
                t2=t2^i;
        }
            
        if(t1>t2)
            return new int[]{t2,t1};
        else
            return new int[]{t1,t2};
    }
}

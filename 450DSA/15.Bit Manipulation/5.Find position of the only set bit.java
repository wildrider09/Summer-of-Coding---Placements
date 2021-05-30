
class Solution {
    static int findPosition(int a) {
        
        int count=0,pos=0;
        int i=1;
        
        while(a>0)
        {
            if((a&1)==1)
              {
                  count++;
                  pos=i;
              }
            a=a>>1;
            i++;
        }    
        
        if(count==1)
            return pos;
        else
            return -1;
            
    }
};

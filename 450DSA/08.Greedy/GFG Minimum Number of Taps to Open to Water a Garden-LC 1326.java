//gfg
class Solution
{
    int min_sprinklers(int gallery[], int n)
    {
        // code here
        int min=-1,max=-1,count=0;
        
        while(max<gallery.length-1)
        {
            for(int i=0;i<gallery.length;i++)
            {
                if(i-gallery[i]<=min+1 && i+gallery[i]>max)
                    max=i+gallery[i];
            }
            if(min==max)    return -1;
            
            count++;
            min=max;
        }
        
        if(min==-1)  return -1;
        return count;
    }
}

//lc
class Solution {
    public int minTaps(int n, int[] gallery) {
        
         int min=0,max=0,count=0;
        
        while(max<gallery.length-1)
        {
            for(int i=min;i<gallery.length;i++)
            {
                if(i-gallery[i]<=min && i+gallery[i]>max)
                    max=i+gallery[i];
            }
            if(min==max)    return -1;
            
            count++;
            min=max;
        }
        
        return count;
        
    }
}

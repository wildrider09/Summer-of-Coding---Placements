class Solution{
    static int minimumNumberOfSwaps(String str){
        
        int oc=0,cc=0,diff=0,sum=0;
        
        for(char ch : str.toCharArray())
        {
            if(ch=='[')
                oc++;
            else
            {
                cc++;
             
                diff=cc-oc;
                if(diff>0)
                    sum+=diff;
            }
        }
        
        return sum;
    }
}

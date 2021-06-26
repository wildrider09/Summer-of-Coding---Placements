class Solution{
    static String smallestNumber(int S, int D){
        // code here
        if( S > 9*D)
            return "-1";
        
        String str="";
        int t=0;
        
        while(S>9)
        {
            t++;
            S-=9;
            str="9"+str;
        }
    
        for(int i=t+1;i<D;i++)
        {
            if(S>1)
            {
                str=(S-1)+str;
                S=1;
            }
            else
                str="0"+str;
        }
        str=S+str;  
        return str;
    }
}

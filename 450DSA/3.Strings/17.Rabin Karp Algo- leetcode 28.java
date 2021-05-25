class Solution {
    public int strStr(String txt, String pat) 
    {
        
        int M = pat.length();
        int N = txt.length();
        
        if(M==0)
            return 0;
        else if(N==0)
            return -1;
        else if(M>N)
            return -1;
        
        int d=256, h=1, p=0, t=0, q=101;
        
        for(int i=0;i<M-1;i++)
            h=(h*d)%q;
        
        for(int i=0;i<M;i++)
        {
            p=(p*d+ pat.charAt(i)) %q ;
            t=(t*d+ txt.charAt(i)) %q ;
        }
        
        for (int i = 0; i <= N - M; i++) 
        {
            if(p==t)
            { 
                System.out.println(i);
                if (txt.substring(i,i+M).equals(pat))
                    return i;
            }
        
            if(i<N-M)         
            {
               t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;
               
               if (t < 0)
                 t = (t + q);
            }
            
        }
        
        return -1;
     }
        
}

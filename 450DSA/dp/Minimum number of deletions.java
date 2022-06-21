class Solution 
{ 
    int t[][]=new int[1001][1001];
    
    int minDeletions(String p, int n)
    {
        for(int i=0;i<=p.length();i++)
            Arrays.fill(t[i],-1);
        
        int lps= lcsc(p.length(),p.length(),new StringBuffer(p).reverse().toString(),p);
        
        return n - lps;
    }
   
    int lcsc(int p, int q, String s1, String s2){
    
        // your code here
        if(p==0||q==0)
            return 0;
        if(t[p][q]!=-1)
            return t[p][q];
        if(s1.charAt(p-1)==s2.charAt(q-1))
            return t[p][q]= 1 + lcsc(p-1,q-1,s1,s2);
        else
            return t[p][q]=Math.max(lcsc(p,q-1,s1,s2) , lcsc(p-1,q,s1,s2));
        
        }
    }

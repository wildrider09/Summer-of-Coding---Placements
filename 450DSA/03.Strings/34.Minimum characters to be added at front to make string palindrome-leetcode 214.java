class Solution {
    
    public String shortestPalindrome(String s) {
        
        String s1 = new StringBuilder(s).reverse().toString();
        String str= s + "#" + s1;
        
        int len = KMP(str.toString());
        
        String addn = new StringBuilder(s.substring(len)).reverse().toString();
         
        return addn + s;
    }
    public int KMP(String s) {
        
          
        int n=s.length();
        int arr[]=new int[n];
        char X[]=s.toCharArray();
        int i=1,j=0;
        
        for( i=1;i<n;i++)
        {
            while(X[j]!=X[i] &j>0)
                j=arr[j-1];
            if(X[i]==X[j])
            {
                arr[i]=j+1;
                j++;
            }
        }
        
        return arr[n-1];
        
        
    }
}

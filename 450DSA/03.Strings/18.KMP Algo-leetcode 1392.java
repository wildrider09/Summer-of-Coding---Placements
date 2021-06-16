class Solution {
    public String longestPrefix(String s) {
        
        
        int n=s.length();
        int arr[]=new int[n];
        char X[]=s.toCharArray();
        int i=1,j=0;
        
        for( i=1;i<n;i++)
        {
            while(X[j]!=X[i] && j>0)
                j=arr[j-1];
            if(X[i]==X[j])
            {
                arr[i]=j+1;
                j++;
            }
        }
        
        return s.substring(0,arr[n-1]);
        
        
        
        
    }
}

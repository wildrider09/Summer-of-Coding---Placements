class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        HashSet<Integer> al=new HashSet<Integer>();
        int i=0,j=0;
        while(i<n || j<m)
        {
            if(i<n)
                al.add(a[i]);
            if(j<m)
                al.add(b[j]);
            i++;j++;
        }
        
        return al.size();
        
    }
}

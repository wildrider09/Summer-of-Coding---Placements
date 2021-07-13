class Solution {
    String ans;
    public String getPermutation(int n, int k) {
        int fact=1;
        ArrayList<Integer> list=new ArrayList<>();
        ans="";
        
        for(int i=1;i<=n;i++)
        {
        	list.add(i);
           	fact*=i;
        }
        
        func(list,n,fact,k-1);
    	return ans;
    }
    
    public void func(ArrayList<Integer> list,int n,int fact,int k)
    {
        if(n==0)
        {
            return;
        }
        else
        {
            
            fact=fact/n;
            int position=k/fact;
            
            ans+=list.remove(position);;
            
            k=k%fact;
            n=n-1;
            
            func(list,n,fact,k);
	}
    }
}

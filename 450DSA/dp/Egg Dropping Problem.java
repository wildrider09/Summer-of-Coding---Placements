
class Solution 
{
    static int t[][]=new int[201][201];
    
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	    for(int i=0;i<201;i++)
	        Arrays.fill(t[i],-1);
	    
	    return eggs(n,k);
	}
	 
	 static int eggs(int n, int k) 
	{
	    // Your code here
	
	   if(k==0 || k==1)
	        return k;
	   if(n==1)
	        return k;
	   int temp1,temp2,min=Integer.MAX_VALUE;
	   for(int i=1;i<=k;i++)
	   {
	       if(t[n-1][i-1]!=-1)
	            temp1=t[n-1][i-1];
	       else
	            temp1=eggs(n-1,i-1);
	            
	       if(t[n][k-i]!=-1)
	            temp2=t[n][k-i];
	       else
	            temp2=eggs(n,k-i);
	       
	       int temp=1+Math.max(temp1,temp2);
	       
	       min=Math.min(temp,min);
	   }
	   return t[n][k]=min;
	}
}
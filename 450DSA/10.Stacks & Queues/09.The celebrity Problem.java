class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st=new Stack<>();
    	int i=0,tempcel=0;
    	
    	for( i=0;i<n;i++)
    	    st.push(i);
    	    
    	while(st.size()>1)
    	{
    	    int a=st.pop();
    	    int b=st.pop();
    	    
    	    if(M[a][b]==1)      st.push(b);
    	   
    	    else                st.push(a);    
    	}
    	
    	tempcel=st.pop();
    	
    	for(i=0;i<n;i++)
    	{
    	    if(M[tempcel][i]!=0)
    	        return -1;
    	}
    	
    	for(i=0;i<n;i++)
    	{
    	    if(i==tempcel)         continue;
    	    
    	    if(M[i][tempcel]!=1)   return -1;
    	}
    	return tempcel;
    }
}

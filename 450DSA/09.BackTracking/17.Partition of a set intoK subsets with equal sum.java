class Solution
{
    static boolean flag;
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	    // Your code here
	    int sum = 0;
	    for(int i:a)
	        sum+=i;
	       
	    if(k<=0 || sum%k!=0)
	        return false;
	    
	    flag=false;
	    int visited[]=new int[n];
	    
	    func(a,n,k,0,0,sum/k,visited);
	    
	    return flag;
    }
    
    public void func(int arr[],int n,int k,int pos,int cur_sum,int target,int visited[])
    {
        if(k==0)
            flag=true;
        
        if(cur_sum==target)
            func(arr,n,k-1,0,0,target,visited);
        
        if(cur_sum>target || pos==n )
            return;
        
        if(cur_sum+arr[pos]<=target && visited[pos]!=1)
        {
            visited[pos]=1;
            func(arr,n,k,pos+1,cur_sum+arr[pos],target,visited);
            visited[pos]=0;
        }
        func(arr,n,k,pos+1,cur_sum,target,visited);
    }
}


class Solution
{   
    static boolean ans;

    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	    ans=false;
	    
	    int sum=0;
	    
	    for(int i=0;i<a.length;i++){
	        sum+=a[i];
	    }
	    
	    if(sum%k!=0)
	        return ans;
	        
        boolean[] visited=new boolean[n];
        
	    isKPartitionPossible(a,visited,k,sum/k,sum/k,0);
	    
	    return ans;
    }
    
    private void isKPartitionPossible(int[] a,boolean[] visited,int k,int target,int sum,int index){
        
        if(sum==0){
            index=0;
            sum=target;
            k--;
        }
                
        if(k==0){
            ans=true;
            return;
        }
        // if for loop,we can also do i=0,just that it will do some extra iterations/comparison everytime from beginning
        for(int i=index;i<a.length;i++){
        
            if(!visited[i] && sum-a[i]>=0){
                
                visited[i]=true;
                
                isKPartitionPossible(a,visited,k,target,sum-a[i],i+1);
        
                visited[i]=false;
            }
            
        }
    }
}

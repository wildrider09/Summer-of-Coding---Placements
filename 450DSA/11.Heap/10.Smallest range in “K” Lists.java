class smallestRangeFromKLists
{
	static int[] findSmallestRange(int[][] arr,int n,int k)
	{
	    //add your code here
	    int ct=0,range=Integer.MAX_VALUE;
	    int ta[]={};
	    int ptr[]=new int[k];
	    PriorityQueue<int[]> min=new PriorityQueue<>(1,(a,b)->a[0]-b[0]);
	    PriorityQueue<int[]> max=new PriorityQueue<>(1,(a,b)->b[0]-a[0]);
	    
	    
	    for(int i=0;i<k;i++)
	    {
	        min.add(new int[]{arr[i][0],i});
	        max.add(new int[]{arr[i][0],i});
	    }
	    
	    while(min.size()==k)
	    {
	        int a=min.peek()[0];
	        int b=max.peek()[0];
	        if((b-a)<range)
	        {
	            ta=new int[]{a,b};
	            range=b-a;
	        }
	        
	        int temp[]=min.remove();
	        max.remove(temp);
	        int locn=temp[1];
	        if(ptr[locn]<n-1)
	        {
	            ptr[locn]++;
	            min.add(new int[]{ arr[locn][ptr[locn]], locn});
	            max.add(new int[]{ arr[locn][ptr[locn]], locn});
	        }
	    }
	    
	    return ta;
	}
}

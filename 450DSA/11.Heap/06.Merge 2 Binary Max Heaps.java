class Compute {
    public void maxProfit(long merged[], long a[], long b[], long n, long m) {
        
        int k=0;
        for(int i=0;i<n;i++)
            merged[k++]=a[i];
        
        for(int i=0;i<m;i++)
            merged[k++]=b[i];
       
        int start=(int)(n+m)/2 - 1;      //build heap
	    
	    for(int i=start;i>=0;i--)
	        heapify(merged,(int)(n+m),i);
    }
        
	static void heapify(long arr[], int n, int i)
	{
	    int large=i;
	    int l=2*i+1;
	    int r=2*i+2;
	    
	    if(l<n && arr[l]>arr[large])
	        large=l;
	    
	    if(r<n && arr[r]>arr[large])
	        large=r;
	   
	    if(large!=i)
	   {
	       long temp=arr[large];
	       arr[large]=arr[i];
	       arr[i]=temp;
	       heapify(arr,n,large);
	   }
	}
}

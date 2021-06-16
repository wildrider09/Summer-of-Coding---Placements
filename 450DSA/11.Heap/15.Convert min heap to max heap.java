import java.util.*;
public class Solution {
    	
    public static void minHeapToMaxHeap(long[] arr) {
        // Your code goes here.
         int start=arr.length/2-1;
	    for(int i=start;i>=0;i--)
	        heapify(arr,arr.length,i);
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


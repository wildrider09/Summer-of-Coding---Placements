// Java program for building Heap from Array

public class BuildHeap {

	static void heapify(int arr[], int n, int i)
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
	       int temp=arr[large];
	       arr[large]=arr[i];
	       arr[i]=temp;
	       heapify(arr,n,large);
	   }
	   
	}

	static void buildHeap(int arr[], int n)
	{
	    int start=n/2-1;
	    for(int i=start;i>=0;i--)
	        heapify(arr,n,i);
	}

	static void printHeap(int arr[], int n)
	{
		System.out.println("Array representation of Heap is:");

		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver Code
	public static void main(String args[])
	{
		int arr[] = { 1, 3, 5, 4, 6, 13, 10,
					9, 8, 15, 17 };

		int n = arr.length;

		buildHeap(arr, n);

		printHeap(arr, n);
	}
}


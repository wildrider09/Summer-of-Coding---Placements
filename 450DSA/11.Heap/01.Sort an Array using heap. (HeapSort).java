
class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
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
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        
         for (int i = 0 ; i < n ; i++) 
         {
            int temp = arr[0];
            arr[0] = arr[n-i-1];
            arr[n-i-1] = temp;
            heapify(arr, n-i-1, 0);
        }
    }
 
}
 


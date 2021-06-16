class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<k && i<n ;i++)
            q.add(arr[i]);
        
        for(int i=0;i<n-k;i++)
        {
            list.add(q.peek());
            q.remove(arr[i]);
            q.add(arr[k+i]);
        }
        
        list.add(q.peek());
        
        return list;
    }
}

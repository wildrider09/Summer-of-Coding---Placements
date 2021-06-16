class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        for(int i=0;i<k;i++)
            q.add(arr[i]);
            
        for(int i=k;i<n;i++)
        {
            if(q.peek()<arr[i])
            {
                q.remove();
                q.add(arr[i]);
            }
        }
        
        while(!q.isEmpty())
            list.add(q.remove());
            
        Collections.reverse(list);
        return list;
    }
}

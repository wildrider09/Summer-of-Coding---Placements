class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> q=new PriorityQueue<>(1,(a,b)->b-a);
        
        for(int i=0;i<k;i++)
            q.add(arr[i]);
        
        for(int i=k; i< arr.length ; i++)
        {
            if(arr[i]>q.peek())
                continue;
            else
            {
                q.remove();
                q.add(arr[i]);
            }
        }
        
        return q.peek();
    } 
}


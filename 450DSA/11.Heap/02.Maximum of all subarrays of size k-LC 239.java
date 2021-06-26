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


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> q=new ArrayDeque<Integer>();
        int n=nums.length,t=0;
        int arr[]=new int[n-k+1];
        
        for(int i=0;i<k && i<n;i++)
        {
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
                q.removeLast();
            
            q.addLast(i);
            
        }
        
        for(int i=k;i<n;i++)
        {
            arr[t++]=nums[q.peekFirst()];
       
            while(!q.isEmpty() && q.peekFirst()<=i-k)
                q.removeFirst();
            
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
                q.removeLast();
            
            q.addLast(i);
        }
        
        arr[t++]=nums[q.peekFirst()];
        return arr;
        
    }
}

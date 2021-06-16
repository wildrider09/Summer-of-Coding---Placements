class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        // Write your code here.
        int ptr[]=new int[k];
        
        PriorityQueue<int[]> q=new PriorityQueue<>(1,(a,b)->a[0]-b[0]);
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<k;i++)
            q.add(new int[] { arr[i][0],i });
        
        for(int i=0; i<(k*k) ; i++)
        {
            int temp[]=q.remove();
            int fetched=temp[1];
            
            list.add(temp[0]);
            
            if(ptr[fetched]< k-1)
            {
                ptr[fetched]++;
                q.add(new int [] { arr[fetched][ptr[fetched]],fetched });
            }
        }
        
        return list;
    }
}

import java.util.*;

public class Solution {

	public static int getKthLargest(ArrayList<Integer> arr, int k) {

		// Write your code here
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int a[]=arr.stream().mapToInt(Integer::intValue).toArray();
        int n=a.length,sum=0;
        int pre[]=new int[n+1];
        
        for(int i=1;i<=n;i++)
        {
            sum+=a[i-1];
			pre[i]=sum;
        }
        
        for(int i=0;i<n;i++)
        {
			for(int j=i+1;j<=n;j++)
            {
				int curr= pre[j]-pre[i];
                
                if(q.size()<k)
                    q.add(curr);
                else if(curr>q.peek())
                {
                 	q.remove();
                    q.add(curr);
                }
            }
        }
        
		return q.peek();
	}
}

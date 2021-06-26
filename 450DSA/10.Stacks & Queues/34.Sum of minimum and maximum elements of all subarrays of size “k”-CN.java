import java.util.*;

public class Solution {
    public static long sumOfMaxAndMin(ArrayList<Integer> nums, int n, int k) {
        // Write your code here.
        long ans=0;     
        Deque<Integer> q1=new ArrayDeque<Integer>();
        Deque<Integer> q2=new ArrayDeque<Integer>();
        
        for(int i=0;i<k && i<n;i++)
        {
            while(!q1.isEmpty() && nums.get(q1.peekLast())<nums.get(i))
                q1.removeLast();
            
            while(!q2.isEmpty() && nums.get(q2.peekLast())>nums.get(i))
                q2.removeLast();
            
            q1.addLast(i);
            q2.addLast(i);
        }
        
        for(int i=k;i<n;i++)
        {
            ans+=nums.get(q1.peekFirst())+nums.get(q2.peekFirst());
       
            while(!q1.isEmpty() && q1.peekFirst()<=i-k)
                q1.removeFirst();
            
            while(!q1.isEmpty() && nums.get(q1.peekLast())<nums.get(i))
                q1.removeLast();
            
            while(!q2.isEmpty() && q2.peekFirst()<=i-k)
                q2.removeFirst();
            
            while(!q2.isEmpty() && nums.get(q2.peekLast())>nums.get(i))
                q2.removeLast();
            
            q1.addLast(i);
            q2.addLast(i);
        }
        
        ans+=nums.get(q1.peekFirst())+nums.get(q2.peekFirst());
        
        return ans;
  
    }
}

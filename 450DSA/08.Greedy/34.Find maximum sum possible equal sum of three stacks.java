import java.util.*;

public class Solution {
	public static int maxSum(Stack<Integer> stk1, Stack<Integer> stk2, Stack<Integer> stk3) {
            // Write your code here.
            int sum1=sum(stk1,0);
            int sum2=sum(stk2,0);
            int sum3=sum(stk3,0);

            while (true)
            {
                if (stk1.isEmpty() || stk2.isEmpty() || stk3.isEmpty())
                    return 0;

                if (sum1==sum2 && sum2==sum3)
                    return sum1;

                if (sum1 >= sum2 && sum1 >= sum3)
                    sum1-=stk1.pop();

                else if (sum2 >= sum1 && sum2 >= sum3)
                    sum2-=stk2.pop();

                else if (sum3 >= sum2 && sum3 >= sum1)
                    sum3-=stk3.pop();
            }
    	}
    
        static int sum(Stack<Integer> st,int s)
        {
		if(!st.isEmpty())
                {
                    int a=st.pop();
                    s+=sum(st,s);
                    st.push(a);
                    s+=a;
                }
 		return s;
        }
}

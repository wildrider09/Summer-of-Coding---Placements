public class Solution {
    public int[] prevSmaller(int[] arr) {
        
        int n=arr.length;
        Stack<Integer> st=new Stack<Integer>();
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            while(true)
            {
                if(st.isEmpty())
                {
                    ans[i]=-1;
                    break;
                }
                else
                {
                    int temp=st.peek();
                    if(temp<arr[i])
                    {
                        ans[i]=temp;
                        break;
                    }
                    else
                        st.pop();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}


class Solution
{
    public static int[] calculateSpan(int arr[], int n)
    {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            while(true)
            {
                if(st1.isEmpty())
                {
                    ans[i]=i+1; 
                    break;
                }
                else
                {
                    int temp=st1.peek();
                    if(temp>arr[i])
                    {
                        ans[i]=i-st2.peek();
                        break;
                    }
                    else
                    {
                        st1.pop();
                        st2.pop();
                    }
                }
            }
            st1.push(arr[i]);
            st2.push(i);
        }
        return ans;
    }
}

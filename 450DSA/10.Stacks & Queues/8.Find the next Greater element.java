class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        Stack<Long> st=new Stack<Long>();
        long ans[]=new long[n];
        for(int i=n-1;i>=0;i--)
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
                    long temp=st.peek();
                    if(temp>arr[i])
                    {
                        ans[i]=temp;
                        break;
                    }
                    st.pop();
                }
                
            }
            st.push(arr[i]);
        }
        return ans;
        
    } 
}


Greater ELement II LC

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        
        Stack<Integer> st=new Stack<Integer>();
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=n-2;i>=0;i--)
            st.push(arr[i]);
        
        for(int i=n-1;i>=0;i--)
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
                    if(temp>arr[i])
                    {
                        ans[i]=temp;
                        break;
                    }
                    st.pop();
                }
            }
            st.push(arr[i]);
        }
        return ans;
        
    }
}

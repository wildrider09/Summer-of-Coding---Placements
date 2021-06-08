class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long arr[], long a) 
    {
        // your code here
        int n=(int)a;
        Stack<Long> st1=new Stack<>();
        Stack<Long> st2=new Stack<>();
        Stack<Long> st3=new Stack<>();
        Stack<Long> st4=new Stack<>();
        long max=0;
        long ans[]=new long[(int)n];
        long res[]=new long[(int)n];
        long  area[]=new long[(int)n];
        
        for(int i=0;i<n;i++)
        {
            while(true)
            {
                if(st1.isEmpty())
                {
                    ans[i]=-1; 
                    break;
                }
                else
                {
                    long temp=st1.peek();
                    if(temp<arr[i])
                    {
                        ans[i]=st2.peek();
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
            st2.push((long)i);
        }
        
        for(int i=n-1;i>=0;i--)
        {
            while(true)
            {
                if(st3.isEmpty())
                {
                    res[i]=a; 
                    break;
                }
                else
                {
                    long temp=st3.peek();
                    if(temp<arr[i])
                    {
                        res[i]=st4.peek();
                        break;
                    }
                    else
                    {
                        st3.pop();
                        st4.pop();
                    }
                }
            }
            st3.push(arr[i]);
            st4.push((long)i);
        }
        
        for(int i=0;i<n;i++)
        {
            area[i]=arr[i]*Math.abs(res[i]-ans[i]-1);
            max=Math.max(area[i],max);
        }
        return max;
    
    }
        
}


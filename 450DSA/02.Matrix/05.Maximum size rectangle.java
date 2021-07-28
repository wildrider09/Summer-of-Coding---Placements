class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        int area=0;
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
                if(M[i][j]!=0)
                    M[i][j]=M[i-1][j]+1;
        }
        
        for(int i=0;i<n;i++)
            area=Math.max(hist(M[i]),area);
        
        return area;
    }
    
    public int hist(int arr[])
    {
        int n=arr.length,max=0;
        Stack<Integer> lstack=new Stack<>();
        Stack<Integer> lindex=new Stack<>();
        int left[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            while(true)
            {
                if(lstack.size()==0)
                {
                    left[i]=-1;
                    break;
                }
                else
                {
                    if(lstack.peek()<arr[i])
                    {
                        left[i]=lindex.peek();
                        break;
                    }
                    lstack.pop();
                    lindex.pop();
                }
            }
                
            lstack.push(arr[i]);
            lindex.push(i);
        }
        
        Stack<Integer> rstack=new Stack<>();
        Stack<Integer> rindex=new Stack<>();
        int right[]=new int[n];
        
        for(int i=n-1;i>=0;i--)
        {
            while(true)
            {
                if(rstack.size()==0)
                {
                    right[i]=n;
                    break;
                }
                else
                {
                    if(rstack.peek()<arr[i])
                    {
                        right[i]=rindex.peek();
                        break;
                    }
                    rstack.pop();
                    rindex.pop();
                }
            }
            rstack.push(arr[i]);
            rindex.push(i);
        }
        
        for(int i=0;i<n;i++)
            max=Math.max(max, (arr[i]*(right[i]-left[i]-1)));    

        
        return max;
    }
}

class Solution {
    public int maximalRectangle(char[][] matrix)
    {  
        if(matrix.length==0)
            return 0;
        int m=matrix.length,n=matrix[0].length,max=Integer.MIN_VALUE;   
        int[][] arr=new int[m][n];
                
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0)
                    arr[i][j]=matrix[i][j]-'0';
            
                else if(matrix[i][j]=='1')
                    arr[i][j]=1+arr[i-1][j];
                
                else
                    arr[i][j]=0;

            }
        }

        for(int i=0;i<m;i++)
            max=Math.max(hist(arr[i]),max);                         
        return max;
    }

    public int hist(int []arr)
    {
        int n=arr.length,max=Integer.MIN_VALUE;
        Stack<Integer> str1=new Stack<>();       //index
        Stack<Integer> str2=new Stack<>();      // element
        int ansr[]=new int[n];
        
        for(int i=n-1;i>=0;i--)
        {
            while(true)
            {
                if(str1.isEmpty())
                {
                    ansr[i]=n;
                    break;
                }
                else
                {
                    int t=str2.peek();
                    if(t<arr[i])
                    {
                        ansr[i]=str1.peek();
                        break;
                    }
                    str1.pop();
                    str2.pop();
                }
            }
            str1.push(i);
            str2.push(arr[i]);
        }
        
        Stack<Integer> stl1=new Stack<>();       
        Stack<Integer> stl2=new Stack<>();       
        int ansl[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            while(true)
            {
                if(stl1.isEmpty())
                {
                    ansl[i]=-1;
                    break;
                }
                else
                {
                    int t=stl2.peek();
                    if(t<arr[i])
                    {
                        ansl[i]=stl1.peek();
                        break;
                    }
                    stl1.pop();
                    stl2.pop();
                }
            }
            stl1.push(i);
            stl2.push(arr[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            int temp=ansr[i]-ansl[i]-1;
            max=Math.max(max,arr[i]*temp);
        }
        return max;        
    }             
                         
}

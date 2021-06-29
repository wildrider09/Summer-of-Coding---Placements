class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<Integer>(r*c);
        
        int front_row=0,front_col=0;
        int end_row=r-1,end_col=c-1;
        int k=0;
        
        while(k<r*c)
        {
            if(k<r*c)
            {
                for(int i=front_col;i<=end_col;i++)
                    list.add(k++,matrix[front_row][i]);
                front_row++;
                
            }
            
            if(k<r*c)
            {
                for(int i=front_row;i<=end_row;i++)
                    list.add(k++,matrix[i][end_col]);
                end_col--;
            }
            
            if(k<r*c)
            {
                for(int i=end_col;i>=front_col;i--)
                    list.add(k++,matrix[end_row][i]);
                end_row--;
            }
            
            if(k<r*c)
            {
                for(int i=end_row;i>=front_row;i--)
                    list.add(k++,matrix[i][front_col]);
                front_col++;
            }
        }
        
        return list;
    }
}

//time :  T(n) = T(n-1) + O(n^2)

class Solution{
    
    static ArrayList<ArrayList<Integer>> list;
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        list=new ArrayList<>();
        
        int chess[][]=new int[n][n];
        ArrayList<Integer> temp=new ArrayList<>();
        
        placeQueen(chess,temp,0,n,n);
        return list;
    }
    
    
    static void placeQueen(int chess[][],ArrayList<Integer> temp,int row,int col,int n)
    {
        if(row==n)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=0;i<col;i++)
        {
            if(isSafe(chess,row,i,n))
            {
                temp.add(row,i+1);
                chess[row][i]=1;
                
                placeQueen(chess,temp,row+1,col,n);
                
                temp.remove(row);
                chess[row][i]=0;
                
            }
        }
    }
    
    static boolean isSafe(int chess[][],int cur_row,int cur_col,int n)
    {
        
        for(int i=cur_row-1,j=cur_col ; i>=0; i--){
            if(chess[i][j]==1)
                return false;
        }
        
        for(int i=cur_row-1,j=cur_col+1 ; i>=0 && j<n ; i--,j++){
            if(chess[i][j]==1)
                return false;
        }
        
        for(int i=cur_row-1,j=cur_col-1 ; i>=0 && j>=0 ; i--,j--){
            if(chess[i][j]==1)
                return false;
        }
        
        return true;
        
    }
}





class Solution {
    
    static List<List<String>> list;
    
    public List<List<String>> solveNQueens(int n) {
        
        list=new ArrayList<>();
        
        int chess[][]=new int[n][n];
        
        placeQueen(chess,0,n,n);
        return list;
    }
    
    
     void placeQueen(int chess[][],int row,int col,int n)
    {
        if(row==n)
        {                                           
            StringBuffer str=new StringBuffer();
            for(int i=0;i<n;i++)
                str.append(".");
            
            
            List<String> temp=new ArrayList<>();
            
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {        
                    if(chess[i][j]==1)
                    {
                        str.setCharAt(j,'Q');
                        temp.add(str.toString());
                        str.setCharAt(j,'.');
                    }
                }
            }
            
           list.add(new ArrayList<>(temp));
           return ;
            
        }
        
        for(int i=0;i<col;i++)                           
        {
            if(isSafe(chess,row,i,n))
            {
                chess[row][i]=1;
                
                placeQueen(chess,row+1,col,n);
                
                chess[row][i]=0;
            }
        }
    }
    
    boolean isSafe(int chess[][],int cur_row,int cur_col,int n)
    {
        
        for(int i=cur_row-1,j=cur_col ; i>=0; i--){
            if(chess[i][j]==1)
                return false;
        }
        
        for(int i=cur_row-1,j=cur_col+1 ; i>=0 && j<n ; i--,j++){
            if(chess[i][j]==1)
                return false;
        }
        
        for(int i=cur_row-1,j=cur_col-1 ; i>=0 && j>=0 ; i--,j--){
            if(chess[i][j]==1)
                return false;
        }
        
        return true;
        
    }
}


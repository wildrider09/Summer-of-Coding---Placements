class Solution {
    public int snakesAndLadders(int[][] board) {
        
        Queue<Integer> q=new LinkedList<>();
        int k=0,steps=0,n=board.length;
        int arr[]=new int[n*n];
        boolean visited[]=new boolean[n*n];
        
        
        
        for(int i=0;i<n/2;i++)
        {
            int temp[]=board[i];
            board[i]=board[n-1-i];
            board[n-1-i]=temp;
        }
                  
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++,k++)
            {   
                arr[k] = board[i][ (i%2==0) ? j : n-1-j ] -1;
            }
            
        }
        
        q.add(0);
        visited[0]=true;
                  
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                int curr=q.poll();
                
                if(curr== n*n-1)    return steps;
                
                for(int i=curr+1;i<=curr+6 && i< arr.length;i++)
                {
                    if(visited[i]==false)
                    {
                        visited[i]=true;
                        
                        int destination = arr[i]==-2 ? i : arr[i];
                        
                        q.add(destination);           
                    }
                }
            }
            
            steps++;
        }
                 
        return -1;
                                  
    }
}

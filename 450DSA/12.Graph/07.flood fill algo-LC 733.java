//BFS
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        Deque<int[]> q=new ArrayDeque<>();
        int row[]={1,0,-1,0};
        int col[]={0,-1,0,1};
        
        int color=image[sr][sc];
        if(color == newColor)
            return image;
        
        q.add(new int[]{sr,sc});
        image[sr][sc]=newColor;
            
        while(!q.isEmpty())
        {
            int []t=q.poll();
            int x=t[0],y=t[1];
            
            for(int i=0;i<4;i++)
            {
                if(isValid(image,x+row[i],y+col[i],image.length,image[0].length,color))
                {
                    image[x+row[i]][y+col[i]]=newColor;
                    q.add(new int[]{x+row[i],y+col[i]});
                }
            }
        }
        
        return image;
    }
    
    public boolean isValid(int image[][],int r,int c,int m,int n,int color)
    {
        if(r<0 || r>=m || c<0 || c>=n || image[r][c]!=color)
            return false;
        return true;
    }
}
    
//DFS
class Solution {
    
    int row[]={1,0,-1,0};
    int col[]={0,-1,0,1};
        
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        
        int color=image[sr][sc];
        if(color == newColor)
            return image;
        
        Dfs(image,sr,sc,color,newColor);
        
        return image;
    }
    
    public void Dfs(int image[][],int sr,int sc,int color,int newColor)
    {
        image[sr][sc]=newColor;
        
        for(int i=0;i<4;i++)
        {
            if(isValid(image,sr+row[i],sc+col[i],image.length,image[0].length,color))
                
               Dfs(image,sr+row[i],sc+col[i],color,newColor);
        }
    }
    
    public boolean isValid(int image[][],int r,int c,int m,int n,int color)
    {
        if(r<0 || r>=m || c<0 || c>=n || image[r][c]!=color)
            return false;
        return true;
    }
}


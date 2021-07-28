import java.util.ArrayList;

public class Solution {
    public static boolean twoCliques(int n, ArrayList<ArrayList<Integer>> edgeList) {
        // Write your code here
        int arr[][]=new int[n][n];
        
        for(int i=0;i<edgeList.size();i++)
        {
            arr[edgeList.get(i).get(0)][edgeList.get(i).get(1)]=1;
          
            arr[edgeList.get(i).get(1)][edgeList.get(i).get(0)]=1;
		}
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)	;
                else		arr[i][j]=1-arr[i][j];
            }
        }
        return isBipartite(arr);
        
    }
    
    static boolean isBipartite(int[][] arr) {
        
        int V=arr.length;
        int[] color=new int[V];
        
        for(int i=0;i<V;i++)
        {
            if(color[i]==0)
            {
                color[i]=1;
                if(checkDfs(arr,color,i)==false)
                    return false;
            }
        }
        return true;
    }
    
    static boolean checkDfs(int[][] G, int[] color, int index)
    {
        for(int i=0;i<G.length;i++)
        { 
            if(G[index][i]==1)
            {
                if(color[i]==0)
            	{
                	color[i]= color[index]==1 ? 2 : 1;
                	if(checkDfs(G,color,i)==false)
                    	return false;
            	}
            	else if(color[i]==color[index])
                	return false;
        	}
        }
        return true;
    }
}

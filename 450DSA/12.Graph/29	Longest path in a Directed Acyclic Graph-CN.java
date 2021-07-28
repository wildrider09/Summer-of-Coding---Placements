import java.util.*;

public class Solution {
    
    static class Pair
    {
        int v,wt;
        Pair(int a,int b)
        {
            v=a;
            wt=b;
        }
    }
    
    public static ArrayList<Integer> findMaxDistances(int n, int src, ArrayList<ArrayList<Integer>> edges) {
    	
        ArrayList<Pair> arr[]=new ArrayList[n];
       	int ans[]=new int[n];
        Arrays.fill(ans,Integer.MIN_VALUE);
        ArrayList<Integer> list=new ArrayList<>();
        boolean visited[]=new boolean[n];
        int topo[]=new int[n];
        
        for(int i=0;i<arr.length;i++)
            arr[i]=new ArrayList<>();
        
 		for(int i=0;i<edges.size();i++)
        {
            int v1=edges.get(i).get(0);
            int v2=edges.get(i).get(1);
            int wt=edges.get(i).get(2);
            
            arr[v1].add(new Pair(v2,wt));
		}
        
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
                Dfs(i,arr,visited,list);
        }
 		for(int i=n-1;i>=0;i--)
            topo[n-i-1]=list.get(i);
  	
        
        int i;
        for(i=0;i<n;i++)
        {
           if(topo[i]==src)	break;
            
           ans[topo[i]]=-1;
        }
        
        ans[topo[i]]=0;
        
        for(;i<n;i++)
        {
            for(int j=0;j<arr[topo[i]].size();j++)
            {
                int t_v1=topo[i];
                int t_v2=arr[topo[i]].get(j).v;
                int t_wt=arr[topo[i]].get(j).wt;
                
                if(ans[t_v2] < ans[t_v1]+t_wt)
                    ans[t_v2]=ans[t_v1]+t_wt;
            }
        }
        
        ArrayList<Integer> al=new ArrayList<>();
        for(int k:ans)
            if(k<0)	al.add(-1);
            else    al.add(k);
        
        return al;
    }
    
    static void Dfs(int pos,ArrayList<Pair> []adj,boolean visited[],ArrayList<Integer> list)
    {
        visited[pos]=true;
 
        for(int i=0;i<adj[pos].size();i++)
        {
            if(visited[adj[pos].get(i).v]==false)
                Dfs(adj[pos].get(i).v,adj,visited,list);
        }
        list.add(pos);
    }
}

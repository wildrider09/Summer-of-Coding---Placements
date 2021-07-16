class Solution
{
    class Pair
    {
        char v1,v2;
        Pair(char a,char b)
        {
            v1=a;
            v2=b;
        }
    }
    
    String s="";
    
    public String findOrder(String [] dict, int N, int K)
    {
        ArrayList<Pair> arr=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean visited[]=new boolean[26];
        
        for(int i=0;i<dict.length-1;i++)
        {
            for(int j=0;j<dict[i].length() && j<dict[i+1].length();j++)
            {
                char s=dict[i].charAt(j);
                char l=dict[i+1].charAt(j);
                if(s!=l)
                {
                    arr.add(new Pair(s,l));
                    break;
                }
            }
        }
        
        for(int i=0;i<26;i++)
            adj.add(new ArrayList<>());
            
        for(int i=0;i<arr.size();i++)
            adj.get((arr.get(i).v1-'a')).add((arr.get(i).v2-'a'));
        
        for(int i=0;i<26;i++)
        {
            if(visited[i]==false && adj.get(i).size()>0)
                Dfs(i,adj,visited);
        }
        return s;
    }
    
    void Dfs(int pos,ArrayList<ArrayList<Integer>> adj,boolean visited[])
    {
        visited[pos]=true;
 
        for(int i=0;i<adj.get(pos).size();i++)
        {
            if(visited[adj.get(pos).get(i)]==false)
                Dfs(adj.get(pos).get(i),adj,visited);
        }
        
        s=(char)(pos+'a')+s;
    }
}

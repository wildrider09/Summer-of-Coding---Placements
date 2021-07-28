class Result {

    static int count;
    public static int journeyToMoon(int n, List<List<Integer>> astronaut) {
    // Write your code here
        boolean visited[]=new boolean[n];
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());

        for(int i=0;i<astronaut.size();i++)
        {
            int x=astronaut.get(i).get(0);
            int y=astronaut.get(i).get(1);
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
     
        long tc=0;int count1=0,size=0;
        
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                count=0;
                DFS(adj,i,visited);
                if(count==1)
                    count1++;
                else
                    list.add(count);
            }
        }
        
        for(int i=0;i<list.size();i++)
        {   
            tc=tc+(count1*list.get(i));
            
            for(int j=i+1;j<list.size();j++)
                tc=tc+(list.get(i)*list.get(j));
        }
        
        tc=tc + (((long)count1*(count1-1))/2);
            
        return (int)tc;
    }
    
    static void DFS(ArrayList<ArrayList<Integer>> adj,int index,boolean visited[])
    {
        visited[index]=true;
        count++;
                
        for(int i: adj.get(index))
        {
            if(visited[i]==false)
                DFS(adj,i,visited);
        }
    }
}

import java.util.*;

class TestClass {

    static int t;
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int V=sc.nextInt();

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int in[]=new int[V];
        int out[]=new int[V];

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        for(int i=0;i<V-1;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            x--;y--;
            adj.get(x).add(y);
        }
        t=0;
        dfs(0,adj,in,out,new boolean[V]);

        int n=sc.nextInt();
        while(n-->0)
        {
            int flag=sc.nextInt();
            int dest=sc.nextInt()-1;
            int source=sc.nextInt()-1;

            if(flag==0 && in[source]>in[dest] && 
               out[source]<out[dest])
                System.out.printf("YES\n");
            else if(flag==1 && in[source]<in[dest] && 
               out[source]>out[dest])
                System.out.printf("YES\n");  
            else
                System.out.printf("NO\n");
        }

    }

    static void dfs(int index,ArrayList<ArrayList<Integer>> adj,int in[], int out[],boolean visited[])
    {
        in[index]=t;
        visited[index]=true;

        for(int i=0;i<adj.get(index).size();i++)
        {
            if(visited[adj.get(index).get(i)]==false)
            {
                t++;
                dfs(adj.get(index).get(i),adj,in,out,visited);
            }
        }

        t++;
        out[index]=t;
    }


}


import java.util.*;
class TestClass {

    static int t;
    public static void main(String args[] ) throws Exception {
        
        t=0;
        Scanner sc = new Scanner(System.in);
        int V=sc.nextInt(),edges=sc.nextInt();
        int disc[]=new int[V];      Arrays.fill(disc,-1);
        int low[]=new int[V];       Arrays.fill(low,-1);
        int parent[]=new int[V];    Arrays.fill(parent,-1);
        ArrayList<Integer> arti =new ArrayList<>();
        ArrayList<int[]> bridges =new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());

        for(int i=0;i<edges;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            adj.get(x).add(y);
	    adj.get(y).add(x);
        }
     
        for(int i=0;i<V;i++)
        {
            if(disc[i]==-1)
                DFS(adj,i,disc,low,parent,arti,bridges);
        }
        
        System.out.println(arti.size());
        Collections.sort(arti);
        for(int i:arti)
            System.out.print(i+" ");
            
        System.out.println("\n"+bridges.size());
        Collections.sort(bridges,(a,b)->a[0]-b[1]);
        for(int i[]:bridges)
            System.out.println(i[0]+" "+i[1]);
    }

    static void DFS(ArrayList<ArrayList<Integer>> adj,int u,
            int disc[],int low[],int parent[], ArrayList<Integer> arti,ArrayList<int[]> bridges)
    {
        disc[u]=t; low[u]=t;
        t++;

        int child=0;

        for(int v:adj.get(u))
        {
            if(disc[v]==-1)
            {
                child++;
                parent[v]=u;
                DFS(adj,v,disc,low,parent,arti,bridges);
                low[u]=Math.min(low[u],low[v]);

                if(parent[u]==-1 && child>1)
                    arti.add(u);

                else if(parent[u]!=-1 && low[v]>=disc[u])
                    arti.add(u);

                if(low[v]>disc[u])
                    bridges.add(new int[]{u,v});
            }

            else if(v!=parent[u])
            {
                low[u]=Math.min(low[u],disc[v]);
            }
        } 
    }
}

import java.util.*;

class TestClass {
    
    static class Pair{
        int v,w;
        Pair(int v,int w){
            this.v=v;
            this.w=w;
        }
    }
    public static void main(String args[] ) throws Exception {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        ArrayList<ArrayList<Pair>> g=new ArrayList<>();

        for(int i=0;i<n;i++)
            g.add(new ArrayList<>());
        

        for(int i=0;i<m;i++) {

            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();

            u--;v--;

            g.get(u).add(new Pair(v,w));

            g.get(v).add(new Pair(u,w));

        }

    
        int[][] dp=new int[n][k+1];

        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        
        int s = 0;

        for(int j=0;j<=k;j++)
            dp[s][j] = 0;

        PriorityQueue<int[]> pq=new PriorityQueue<>(1,
                             (a,b)->a[2]-b[2]);

        pq.add(new int[]{0,s,0});

        while(!pq.isEmpty()) {

            int u = pq.peek()[1], j = pq.peek()[2];

            pq.remove();    

            for(int i=0;i<g.get(u).size();i++) {

                Pair p=g.get(u).get(i);
                int v = p.v, w = p.w;

                if(dp[v][j] > dp[u][j] + w) {

                    pq.remove(new int[]{dp[v][j],v,j});

                    dp[v][j] = dp[u][j] + w;

                    pq.add(new int[]{dp[v][j],v,j});
                }

                if(j!=k && dp[v][j+1] > dp[u][j]) {

                    pq.remove(new int[]{dp[v][j+1],v,j+1});

                    dp[v][j+1] = dp[u][j];

                    pq.add(new int[]{dp[v][j+1],v,j+1});

                }                
            }
        }

        for(int i=0;i<n;i++)
        {
            int ans = dp[i][0];

            for(int j=1;j<=k;j++) 
                ans = Math.min(ans,dp[i][j]);

            System.out.print(ans+" ");

        }
    }
}

import java.io.*;
 
class GFG {
 
    // Number of vertices in the graph
    int V = 4;
 
    int countTriangle(int graph[][],boolean isDirected)
   {
       int count_Triangle = 0;
 
       // Consider every possible triplet of edges in graph
       
       for (int i = 0; i < V; i++)
       {
           for (int j = 0; j < V; j++)
           {
               for (int k=0; k<V; k++)
               {
		      if (graph[i][j] == 1 && graph[j][k] == 1 && graph[k][i] == 1)
                
			      count_Triangle++;
               }
           }
       }
  
       // If graph is directed , division is done by 3 else division
       // else by 6 is done
       
       if(isDirected == true)
           count_Triangle /= 3;
       else
           count_Triangle /= 6;

       return count_Triangle;
   }
  
    public static void main(String args[])
   {
        
       // Create adjacency matrix of an undirected graph
       int graph[][] = {{0, 1, 1, 0},
                        {1, 0, 1, 1},
                        {1, 1, 0, 1},
                        {0, 1, 1, 0}
                       };
     
       // Create adjacency matrix of a directed graph
       int digraph[][] = { {0, 0, 1, 0},
                           {1, 0, 0, 1},
                           {0, 1, 0, 0},
                           {0, 0, 1, 0}
                         };
       
      GFG obj = new GFG();
  
    System.out.println("The Number of triangles in undirected graph : " +obj.countTriangle(graph, false));
 
    System.out.println("\n\nThe Number of triangles in directed graph : "+obj.countTriangle(digraph, true));
 
   }
}


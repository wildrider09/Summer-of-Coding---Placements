

public class Solution {
    public int[] solve(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();     
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
    
        diagonalPrintUtil(root, 0, map);
    
        for(Map.Entry<Integer, ArrayList<Integer>> entry:  map.entrySet())
            list.addAll(entry.getValue());

        return list.stream().mapToInt(Integer::intValue).toArray();
      }
      
     void diagonalPrintUtil(TreeNode root,int d, 
                                 HashMap<Integer,ArrayList<Integer>> map)
     {
         
        if (root == null)
            return;
        
        
        ArrayList<Integer> k = map.get(d);
         
        if (k != null)
            k.add(root.val);
        else
        {
            k = new ArrayList<>();
            k.add(root.val);
        }
        
        map.put(d,k);
        if(root.left==null && root.right==null)
            return;
         
        diagonalPrintUtil(root.left,d + 1, map);
        diagonalPrintUtil(root.right,d, map);
    
         
     }   

    
}


class Tree
{
     ArrayList<Integer> result;

    public ArrayList<Integer> diagonal(Node root)
    {
        result = new ArrayList<>();
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) 
        {
            Node curr = queue.remove();
            while(curr!=null) 
            {
                result.add(curr.data);
                if(curr.left!=null)
                    queue.add(curr.left);
                curr = curr.right;
            }
        }
        
        return result;
    }

}










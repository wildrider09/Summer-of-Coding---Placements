
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


class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> list=new ArrayList<>();
        
        Queue<Node> queue=new LinkedList<>();
        Queue<Integer> al=new LinkedList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        
        if(root==null)
            return list;
        
        queue.add(root);
        al.add(0);
        
        while(!queue.isEmpty())
        {
            Node t=queue.remove();
            int d=al.remove();
                
            if(t.left!=null){
                queue.add(t.left);
                al.add(d-1);
            }
                
            if(t.right!=null){
                queue.add(t.right);    
                al.add(d+1);
            }
                
            if(!map.containsKey(d))
                map.put(d,t.data);
        }
            
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
                 list.add(entry.getValue());
                 
        return list;
    }
}

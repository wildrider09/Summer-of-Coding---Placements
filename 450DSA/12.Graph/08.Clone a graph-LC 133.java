class Solution {
    public Node cloneGraph(Node node) {
        
        if(node==null )         
            return null;        
        
        if(node.neighbors==null)
            return new Node(node.val);
        
        HashMap<Node,Node> map=new HashMap<>();
        Deque<Node> q=new ArrayDeque<>();
            
        q.addLast(node);
        map.put(node,new Node(node.val));
        
        while(!q.isEmpty())
        {
            Node t=q.poll();
            
            for(int i=0;i<t.neighbors.size();i++)
            {    
                Node pos=t.neighbors.get(i);
                if(!map.containsKey(pos))
                {
                     q.addLast(pos);
                     map.put(pos,new Node(pos.val));       
                }
                map.get(t).neighbors.add(map.get(pos));   
            }
         }
            
         return map.get(node);
    }
}

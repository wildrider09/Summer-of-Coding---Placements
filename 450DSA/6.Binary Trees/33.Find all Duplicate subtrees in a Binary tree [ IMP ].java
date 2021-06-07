class Solution{
   
    
    HashMap<String,Integer> map1=new HashMap<>();
    List<Node> list=new ArrayList<Node>();
    
    public List<Node> printAllDups(Node root)
    {
        if(root==null)
            return list;
            
        solve(root);
        
        return  list;
    }
    
    String solve(Node root)
    {
        if(root==null)
            return "";
     
     
        String s="";
     
        s+=root.data+"#";
        s+=solve(root.left)+"#";
        s+=solve(root.right);
        
        
        
        if(map1.get(s)==null)
            map1.put(s,1);
            
        else if(map1.get(s)==1)
        {
            map1.put(s,map1.get(s)+1);
            list.add(root);
        }
        
        return s;
    }
    
}

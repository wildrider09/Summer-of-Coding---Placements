class Solution {
    
    HashMap<String,Integer> map=new HashMap<>();
    
    int dupSub(Node root) {
        
        // code here 
        if(root==null)
            return 0;
            
        solve(root);
        
        for(Map.Entry<String,Integer> hmap :  map.entrySet())
        {
            if(hmap.getValue()>1)
                return 1;
        }
        return 0;
        
    }
    
    String solve(Node root)
    {
        if(root==null)
            return "";
        String s="";
        
        if(root.left==null && root.right==null)
            return root.data+"";
        
        s+=root.data+"#";
        s+=solve(root.left)+"#";
        s+=solve(root.right);
        
        if(map.get(s)!=null)
            map.put(s,map.get(s)+1);
        else
            map.put(s,1);
            
        return s;
    }
}

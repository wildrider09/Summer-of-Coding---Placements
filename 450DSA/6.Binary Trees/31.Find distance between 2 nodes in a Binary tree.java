class GfG {

    int findDist(Node root, int a, int b) {
        
       return solve1(root,a,b,0);
    }

    int solve1(Node root,int a,int b,int h)
    {
        if(root==null)
            return -999;
    
            
        int l=solve1(root.left,a,b,h+1);
        int r=solve1(root.right,a,b,h+1);
        
        if((root.data==a || root.data==b) && (l!=-999 || r!=-999))    
            return Math.abs(Math.max(l,r)-h);
            
        if(root.data==a || root.data==b)
            return h;
        
        if(l!=-999 && r!=-999)
            return l+r-(2 * h);
        
        else if(l!=-999)
            return l;
        
        else if(r!=-999)
            return r;
        
        else
            return -999;
    }
        
}

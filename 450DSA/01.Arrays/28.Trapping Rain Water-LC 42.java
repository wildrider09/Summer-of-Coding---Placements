class Solution {
    public int trap(int[] height) {
        
        int n=height.length;
        int lmax=0,rmax=0,total=0;
        int pre[]=new int[n];
        int suf[]=new int[n];
        
        for(int i=0,j=n-1;i<n;i++,j--)
        {
            lmax=Math.max(lmax,height[i]);
            pre[i]=lmax;
            
            rmax=Math.max(rmax,height[j]);
            suf[j]=rmax;
        }
        
        for(int i=0;i<n;i++)
            total+=Math.min(pre[i],suf[i])-height[i];
        
        return total;
        
        
    }
}

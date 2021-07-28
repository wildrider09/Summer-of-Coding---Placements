class Solution{
    static int minJumps(int[] arr){
        // your code here
        
        int jumps=0,currend=0,currfar=0;
        
        for(int i=0;i<arr.length;i++)
        {
            currfar=Math.max(currfar,i+arr[i]);
            if(i==currend)
            {
                jumps++;
                currend=currfar;
            }
            
            if(currend>=arr.length-1)
                break;
        }
        
        if(currend>=arr.length-1) return jumps;
        
        return -1;
    }
}


class Solution {
    public int jump(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        
        ans[0]=0;
        if(arr[0]==0)   return 0;
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i<=j+arr[j])
                {
                    ans[i]=Math.min(ans[i],ans[j]+1);
                    break;
                }
            }
        }
        
        return ans[n-1]==Integer.MAX_VALUE ? -1 : ans[n-1];
        
    }
}

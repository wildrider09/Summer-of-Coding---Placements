class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int max=0,sum=0;
        
        for(int i=0;i<N;i++)
        {
            sum+=A[i];
            
            if(!map.containsKey(sum))
                map.put(sum,i);
                
            if(sum==K)
                max=Math.max(max,i+1);
            
            if(map.get(sum-K)!=null)
                max=Math.max(max,i-map.get(sum-K));
            
        }
        
        return max;
    }
    
    
}

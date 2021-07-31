class Solution {

    int maxLen(int[] arr, int N)
    {
        // Your code here
        int max2=0,sum=0;
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<N;i++)
            arr[i]= arr[i]==0 ? -1 : arr[i];
            
        for(int i=0;i<N;i++)
        {
            sum+=arr[i];
            
            if(sum==0)
                max2=i+1;
            
            else if(set.get(sum)!=null)
                max2= Math.max(max2,(i-set.get(sum)));
                
            else
                set.put(sum,i);
        }
        
        return max2;
    }
}


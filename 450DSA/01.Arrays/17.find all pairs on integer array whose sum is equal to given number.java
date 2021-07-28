class Solution {
    int getPairsCount(int[] arr, int n, int k) {
    
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            int rr = k-arr[i];
            if(mp.containsKey(rr))
            {
                count += mp.get(rr);
                mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1);
            }
        }
        return count;
    }
}

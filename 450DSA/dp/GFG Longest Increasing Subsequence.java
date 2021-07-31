//O(n^2)
class Solution 
{
    static int longestSubsequence(int size, int a[])
    {
        // code here
        
        int arr[]=new int[size];
        int max=Integer.MIN_VALUE;
        Arrays.fill(arr,1);
        
        for(int i=1;i<size;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(a[i]>a[j] && arr[i]<=arr[j])
                    arr[i]=arr[j]+1;
            }
        }
        for(int i : arr)
        {
            if(i>max)
                max=i;
        }
        return max;
    }
} 


//O(n logn)
class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int arr[])
    {
        // code here
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[0]);
        
        for(int i=1;i<size;i++)
        {
            if(list.get(list.size()-1)<arr[i])
                list.add(arr[i]);
            
            else
            {
                int index=Collections.binarySearch(list,arr[i]);
                index=Math.abs(index)-1;
                list.set(index,arr[i]);
            }
        }
        
        return list.size();
    }
} 

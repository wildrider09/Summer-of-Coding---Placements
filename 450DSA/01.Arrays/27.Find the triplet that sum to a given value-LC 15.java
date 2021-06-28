class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       Arrays.sort(A);
       for(int i=0;i<n;i++)
       {
           int start=i+1,end=n-1;
           while(start<end)
           {
                if(A[i]+A[start]+A[end]==X)
                    return true;
                
                else if(A[i]+A[start]+A[end]>X)
                    end--;
                    
                else
                    start++;
           }
       }
       return false;
    }
}


class Solution {
    public List<List<Integer>> threeSum(int[] A) {
        
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(A);
        for(int i=0;i<A.length;i++)
        {
            int start=i+1,end=A.length-1;
            while(start<end)
            {
                if(A[i]+A[start]+A[end]==0)
                {
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(A[i]);
                    list.add(A[start]);
                    list.add(A[end]);
                        
                    if(!set.contains(list))
                    {
                        set.add(list);
                        ans.add(new ArrayList<>(list));
                    }
                    start++;end--;
                }
                
                else if(A[i]+A[start]+A[end]>0)
                    end--;
                    
                else
                    start++;
           }
        }
        return ans;
        
    }
}

//backtracking
class Sol
{
    public static int wordBreak(String s, ArrayList<String> wordDict )
    {
        boolean f= func(s,0,s.length()-1,wordDict);
        if(f)	return 1;
        return 0;
    }
    
    static boolean func(String s,int start, int end ,List<String> dict)
    {
        if(start>end)
            return true;
        
        for(int i=start; i<=end; i++)
        {
            String temp=s.substring(start,i+1);
            if(dict.contains(temp))
            {
                boolean f=func(s,i+1,end,dict);
                if(f==true)
                    return true;
            }
        }
        return false;
    }
}

//memoization
class Solution {
  
    public boolean wordBreak(String s, List<String> wordDict) {       
        
        int arr[]=new int[s.length()];
        Arrays.fill(arr,-1);
        return func(s,0,s.length()-1,arr,wordDict);
        
    }
    
    boolean func(String s,int start, int end ,int arr[],List<String> dict)
    {
        if(start>end)
            return true;
        
        if(arr[start]!=-1)
            return arr[start]==1?true:false;
        
        for(int i=start; i<=end; i++)
        {
            String temp=s.substring(start,i+1);
            if(dict.contains(temp))
            {
                boolean f=func(s,i+1,end,arr,dict);
                if(f==true)
                {
                    arr[start]=1;
                    return true;
                }
            }
        }
        arr[start]=0;
        return false;
    }
}


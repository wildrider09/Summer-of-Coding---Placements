class Solution{
    
    static List<String> list;    
    static List<String> wordBreak(int n, List<String> wordDict, String s)
    {
        list=new ArrayList<String>();
        
        int arr[]=new int[s.length()];
        Arrays.fill(arr,-1);
        
        func(s,0,s.length()-1,arr,"",wordDict);
        return list;
    }
    static boolean func(String s,int start, int end ,int arr[],String res,List<String> dict)
    {
        if(start>end)
        {
            list.add(res.substring(0,res.length()-1));
            return true;
        }   
        if(arr[start]==0) 		//memoizn not much useful here ,optional
            return false;		// just  checking case for not true
                
        for(int i=start; i<=end; i++)
        {
            String temp=s.substring(start,i+1);
            if(dict.contains(temp))
            {
                boolean f=func(s,i+1,end,arr,res+temp+" ",dict);
                if(f==false)
                {
                    arr[start]=0;
                    return false;
                }
            }
        }
        return true;
    }
}



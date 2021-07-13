class Solution {
    
    List<List<String>> list;
    public List<List<String>> partition(String s) {
        
        list=new ArrayList<>();
        
        func(s,new ArrayList<>(),0,s.length());
        
        return list;
    }
    
    public void func(String s,List<String> ans, int pos,int n)
    {
        if(pos==n){
            list.add(new ArrayList<>(ans));
            return;
        }
        
        for(int i=pos;i<n;i++)
        {
            if(isPalindrome(s,pos,i))
            {
                ans.add(s.substring(pos,i+1));
                func(s,ans,i+1,n);
                ans.remove(ans.size()-1);
            }
        }
    }
    
    public static boolean isPalindrome(String s,int start,int end)
    {
        int p1=start;
        int p2=end;
        while(p1<p2) 
        {
            if(s.charAt(p1)!=s.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
}

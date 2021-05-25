class Solution
{
    List<String> ls=new ArrayList<String>();
    
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        printsubs(s,"");
        
        Collections.sort(ls);
        
        
        return ls;
    }
    
    public void printsubs(String s,String ans)
    {
        // Code here
        if(s.length()==0)
        {
            if(ans.length()!=0)
                ls.add(ans);
            
            return;
        }
        
        printsubs(s.substring(1),ans);
        
        printsubs(s.substring(1),ans+s.charAt(0));
    }
}

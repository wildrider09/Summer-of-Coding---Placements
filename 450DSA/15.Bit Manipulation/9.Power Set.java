//Recursion

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

//Bit Manipulation

class Solution
{
    List<String> ls=new ArrayList<String>();
    
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        printsubs(s);
        
        Collections.sort(ls);
        
        
        return ls;
    }
    
    public void printsubs(String s)
    {
        int power=(int)Math.pow(2,s.length());
        String t="";
        
        for(int i=0;i<power;i++)
        {
            t="";
            
            for(int j=0;j<s.length();j++)
            {
                if( (i & (1<<j)) >0)
                    t+=s.charAt(j);
                    
            }
            
            if(t.length()>0)
                ls.add(t);
        }
        
    }
}

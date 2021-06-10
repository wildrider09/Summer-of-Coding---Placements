class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        int[] map=new int[256];
        
        for(char c : p.toCharArray()) 
            map[c]++;
        
        int counter=p.length();
        int begin=0, end=0, head=0;
        int d=Integer.MAX_VALUE;
        
        while(end<s.length())
        {
            if(map[s.charAt(end)]-- > 0)
            { 
                counter--; 
            }
            
            end++;
            
            
            while(counter==0)
            { 
                if(end-begin<d)  
                {
                    d=end-begin;
                    head=begin;
                }
                
                if(map[s.charAt(begin)]++==0)
                {
                       
                    counter++;  
                }
                
                begin++;    
             
            }
        
        }
        
        return d==Integer.MAX_VALUE? "-1":s.substring(head, head+d);
    
    }
}


class Solution {
    public String findSubString( String s) {
        // Your code goes here
        
        int[] map=new int[256];
        
        int counter=0, begin=0, end=0, head=0;
        int d=Integer.MAX_VALUE;
       
        
        for(char c : s.toCharArray()) 
        {  
            if(map[c]==0)
            {
                map[c]++;
                counter++;
            }
        }
        
        
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


class RomanToNumber {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        int ans=0,prev=0,curr=0;
        
        for(int i=0;i<s.length();i++)
        {
            curr=0;
            if(s.charAt(i)=='I')
                curr=1;
            else if(s.charAt(i)=='V')
                curr=5;
            else if(s.charAt(i)=='X')
                curr=10;
            else if(s.charAt(i)=='L')
                curr=50;
                if(s.charAt(i)=='C')
                curr=100;
            else if(s.charAt(i)=='D')
                curr=500;
            else if(s.charAt(i)=='M')
                curr=1000;
                
            if(prev<curr)
                ans=ans+curr-prev-prev;
            else
                ans=ans+curr;
                
            prev=curr;
            
        }
        
        return ans;        
        
        
    }
}

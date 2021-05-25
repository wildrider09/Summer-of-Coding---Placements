class Solution {
    int isPlaindrome(String s) {
        // code here
        
          for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)==s.charAt(s.length()-1-i))
                continue;
            else
                return 0;
        
        }
        
        return 1;
        
    }
};
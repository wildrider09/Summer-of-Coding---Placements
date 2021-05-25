class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(goal.length()!=s.length())
            return false;
        s=s+s;
        
        
        if(s.contains(goal))
            return true;
        else
            return false;
        
    }
    
    //method 2: substring of i->end + substring of 0->i-1 : O(n)
}
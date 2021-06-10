
class Solution {
    
    public String reverse(String S){
        //code here
        if(S.length()==0)
            return "";
        
        return reverse(S.substring(1)) + S.charAt(0);
    }

}

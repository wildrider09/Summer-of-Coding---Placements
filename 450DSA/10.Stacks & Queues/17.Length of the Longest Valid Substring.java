class Solution {
    static int findMaxLen(String S) {
        // code here'
        int count=0,temp=0;
        int oc=0,cc=0;
        for(char ch:S.toCharArray()){
            if(ch=='('){
                oc++;
            }
            else if(ch==')'){
                cc++;
            }    
            
            if(oc<cc){
                cc=0;
                oc=0;
            }
            
            else if(oc==cc){
                count=Math.max(count,2*oc);
            }
            
        }
        oc=0;cc=0;
        for(int i=S.length()-1;i>-1;i--){
            char ch=S.charAt(i);
            if(ch=='('){
                oc++;
            }
            else if(ch==')'){
                cc++;
            }    
            
            if(oc>cc){
                cc=0;
                oc=0;
            }
            
            else if(oc==cc){
                count=Math.max(count,2*cc);
            }
            
        }
        return count;
    }
}

class Solution{
    public String removeConsecutiveCharacter(String S){
        
        
        if(S.length()==1 || S.length()==0)
            return S;
            
        String s1=""+S.charAt(0);
        
        for(int i=1;i<S.length();i++)
        
            if(S.charAt(i)!=S.charAt(i-1))
                s1+=S.charAt(i);
        
        
        return s1;
        
    }
}

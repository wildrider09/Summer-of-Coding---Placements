class Solution {
    public int distinctSubseqII(String s) {
        
        long count=1;  
        long mod=(long)1e9+7;
        long carr[]= new long[26];
        
        for(int i=0;i<s.length();i++)
        {
            long prev= count;
            char ch=s.charAt(i);            
            count = (count *2 - carr[ch-'a'] + mod)%mod;
            carr[ch-'a']= prev;
        }
        
	    
        return (int)count-1;
        
    }
}

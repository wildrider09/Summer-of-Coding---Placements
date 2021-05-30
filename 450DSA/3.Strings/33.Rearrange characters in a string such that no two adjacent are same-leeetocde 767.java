class Solution {
    public String reorganizeString(String s) {
        
        int freq[]=new int[26];
        char arr[]=new char[s.length()];
        
        int i,high=0;
        char c=0;
        
        for(char ch: s.toCharArray())
        {
            freq[ch-'a']++;
            if(high<freq[ch-'a'])    
            {
                high=freq[ch-'a'];
                c=ch;
            }
        }
        
        if(high>(s.length()+1)/2)
            return "";
        
        
        for(i=0;i<s.length() && i < 2*high ; i+=2)
        {
            arr[i]=c;
            freq[c-'a']--;
        }
        
        for(int j=0;j<freq.length;j++)
        {
            while(freq[j]>0)
            {
                if(i>=arr.length)
                    i=1;
                                
                arr[i]=(char)(j+'a');
                i+=2;
                freq[j]--;
            }
        }
        
        return String.valueOf(arr);
    }
}

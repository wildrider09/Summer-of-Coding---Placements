class Solution {
    public String reorganizeString(String s) {
        
        PriorityQueue<int[]> q=new PriorityQueue<>(1,(a,b)->b[0]-a[0]);
        int freq[]=new int[26];
        int ct=0;
        String s1="";
        
        for(char ch: s.toCharArray())
            freq[ch-'a']++;
        
        
        for(int i:freq)
        {
            if(i>0)
                q.add(new int[]{i,ct});
            ct++;
        }
        
        if(q.peek()[0]>(int)Math.ceil(s.length()/2.0))
            return "";
        
        int prev[]={-1,-1};
        
        while(!q.isEmpty())
        {
            int temp[]=q.remove();
            s1+=(char)(temp[1]+97);
            
            if(prev[0]>0)
                q.add(prev);
            
            temp[0]--;
            prev=temp;
        }
        
        return s1;
    }
}

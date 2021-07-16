class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        HashSet<String> set = new HashSet<>(wordList);
        
        if(!set.contains(endWord))
            return 0;
        
        Queue<String> q = new LinkedList<>();
        int depth = 1, size = 0;
        q.add(beginWord);
        
        while(!q.isEmpty())
        {
            depth++;
            size = q.size();
            
            for(int i=0;i<size;i++)
            {
                String t = q.poll();
                char[] temp = t.toCharArray();
                
                for(int j=0;j<temp.length;j++)
                {
                    for(char k = 'a'; k <= 'z';k++)
                    {
                        temp[j] = k;
                        String str = new String(temp);
                        
                        if(set.contains(str))
                        {
  		       	    if(str.equals(endWord))
                            	return depth;
                            
                            q.add(str);
                            set.remove(str);
                        }
                        
                     
                    }
                    temp[j]=t.charAt(j);
                }   
            }   
        }  
        
        return 0;
    }
}

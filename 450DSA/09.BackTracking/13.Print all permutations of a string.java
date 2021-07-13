class Solution {
    
    List<String> list=new ArrayList<>();
    public List<String> find_permutation(String S) {
        // Code here

        func(S,0,S.length()-1);
        Collections.sort(list);
        return list;
    }
    
    void func(String s,int start,int end)
    {
        if(start>end)
            list.add(s);
        
        for(int i=start;i<=end;i++)
        {
            s=swap(s,start,i);
            func(s,start+1,end);
            s=swap(s,start,i);
        }
    }
    
    String swap(String s,int i,int j)
    {
        char[] charArray = s.toCharArray();
        char temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

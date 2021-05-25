
class Solution {
    
    List<String> ls=new ArrayList<String>();
      
    public List<String> find_permutation(String S) {
        // Code here
        
        func(S,0,S.length()-1);
        Collections.sort(ls);
        return ls;
    }
    
    public void func(String s,int l,int r)
    {
        if(l==r)
            ls.add(s);
        else
        {
            for(int i=l;i<=r;i++)
            {
                s=swap(s,l,i);
                func(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }
    
    public String swap(String s,int i, int j)
    {
        char[] charArray = s.toCharArray();
        char temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
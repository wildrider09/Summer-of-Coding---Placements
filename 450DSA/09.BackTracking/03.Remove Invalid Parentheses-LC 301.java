//optimized soln < O(2^n)
class Solution {
    
    HashSet<String> set=new HashSet<>();
    int ml=0;
    
    public List<String> removeInvalidParentheses(String s) {
        List<String> list=new ArrayList<>();
        int oc=0,cc=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                oc++;
            }
            else if(s.charAt(i)==')'){
                if(oc>0){
                    oc--;
                }
                else cc++;
            }
        }
        
        ml=s.length()-oc-cc;
        
        find(s,oc,cc,s.length(),"",0);
        
        list.addAll(set);
        
        if(list.size()==0) list.add("");
        
        return list;
        
    }
    
    void find(String s,int oc,int cc,int n,String ans,int bf){
        
        if(cc<0 || oc<0 || bf<0 || s.length()==0){
            
            if(ml==ans.length() && cc==0 && oc==0 && bf==0)
                set.add(ans);
            
            return;
        }
        
        char ch=s.charAt(0);
        s=s.substring(1);
        
        if(ch=='('){
            
           find(s,oc-1,cc,n,ans,bf);
            
           find(s,oc,cc,n,ans+ch,bf+1);
        }
        
        else if(ch==')'){
            
           find(s,oc,cc-1,n,ans,bf);
    
           find(s,oc,cc,n,ans+ch,bf-1);
        }
            
        else 
            find(s,oc,cc,n,ans+ch,bf);            
        
    }
}




//time consuming O(2^n)
class Solution {
    
    List<String> list=new ArrayList<String>();
    HashSet<String> set=new HashSet<String>();
    
    public List<String> removeInvalidParentheses(String s) {
        
        int min_str=s.length()-getMin(s);
            
        if(min_str==0){
            
            list.add("");
            return list;
        }
        
        func(s,"");
        
        for (String ele : set){
            
            if(ele.length()==min_str)
                list.add(ele);   
        }
        
        return list;
    }
    
    void func(String s,String ans)
    {
        
        if(checkValid(ans) && ans.length()>0)
            set.add(ans);
         
        if(s.length()==0)
            return;
        
        char ch=s.charAt(0);
        
        func(s.substring(1) , ans+ch);
        
        if(ch>=97 && ch<=122) 
            return;
        else
            func(s.substring(1) , ans);    
    }
    
    boolean checkValid(String x)
    {
        Stack<Character> st=new Stack<Character>();
        
        for(char ch : x.toCharArray())
        {
            if(ch=='(')
            {
                st.push(ch);
                continue;
            }
            else if(ch==')')
            {
                if(st.isEmpty())
                    return false;
                else
                    st.pop();
            }   
        } 
        if(st.empty()==true)
            return true;
        return false;
    }
        
    int getMin(String x)
    {
        int count=0;
        Stack<Character> st=new Stack<Character>();
        
        for(char ch : x.toCharArray())
        {
            if(ch=='(')
            {
                st.push(ch);
                continue;
            }    
            else if(ch==')')
            {
                if(st.isEmpty())
                    count++;
                else
                    st.pop();
            }
       }
        return count+st.size();
    }    
}

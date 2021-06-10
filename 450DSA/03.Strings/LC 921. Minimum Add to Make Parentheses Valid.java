class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st=new Stack<Character>();
        int cc=0;
        
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            {
                st.push('(');
            }
            else
            {
                if( !st.isEmpty() && st.peek()=='(')
                    st.pop();
                else
                    st.push(')');
            }
        }
        
        
        return (st.size());
        
    }
}

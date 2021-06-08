class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        char t;
        Stack<Character> st=new Stack<Character>();
        
        for(char ch : x.toCharArray())
        {
            if(ch=='(' || ch=='{' || ch=='[' )
            {
                st.push(ch);
                continue;
            }
            
            if(st.empty())
                return false;
                
            switch(ch)
            {
                case ')': t=st.pop();
                          if(t=='{' || t=='[')
                             return false;
                          break;
                          
                case '}': t=st.pop();
                          if(t=='(' || t=='[')
                             return false;
                          break;

                case ']': t=st.pop();
                          if(t=='{' || t=='(')
                             return false;
                          break;
                          
                default : return false;
            }
            
        }
        return (st.empty());
            
    }
}


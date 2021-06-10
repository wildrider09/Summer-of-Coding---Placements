public class Solution {
    public int braces(String A) {
        
        Stack<Character> st=new Stack<>();
        for(char ch : A.toCharArray())
        {
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='(')
                st.push(ch);
            
            else if(ch==')')
            {
                if(st.peek()=='(')
                    return 1;
                else
                    while(st.pop()!='(');
            }
        }
        return 0;
    }
}


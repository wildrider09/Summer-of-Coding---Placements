class Solution
{
    static int getprec(char c)
    {
        switch(c)
        {
            case '+':
            case '-': return 1;
            case '*':
            case '/':return 2;
            case '^':return 3;
        }
        return -1;
    }
    public static String infixToPostfix(String exp)
    {
        Stack<Character> stack=new Stack<>();
        String res="";
        exp="(" + exp + ")";
        for(char ch:exp.toCharArray())
        {
            if(Character.isLetter(ch))
                res+=ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')')
            {
                while(!stack.isEmpty() && stack.peek()!='(')
                    res+=stack.pop();
                
                stack.pop();
            }
            else
            {
                while(!stack.isEmpty() && getprec(stack.peek())>=getprec(ch))
                    res+=stack.pop();
                    
                stack.push(ch);
            }
        }
        
        return res;
    }
}

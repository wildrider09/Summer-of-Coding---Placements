class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<String> opr=new Stack<>();        
        for(char ch: S.toCharArray())
        {           
           	if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        	{
                int a= Integer.parseInt(opr.pop());
                int b= Integer.parseInt(opr.pop());               
                if(ch=='+')
               		opr.push((b+a)+"");
                else if(ch=='-')
               		opr.push((b-a)+"");
                else if(ch=='*')
                   opr.push((b*a)+"");  
                else 
                  opr.push((b/a)+"");  
            }               
           else 
               opr.push(ch+"");  
        }
        return Integer.parseInt(opr.pop());
    }

}

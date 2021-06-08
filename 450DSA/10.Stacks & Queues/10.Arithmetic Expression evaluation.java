import java.util.*;
public class Solution
{
    public static int evaluateArithmeticExpression(String s) 
    {
        // Write your code here
        String postf="";
        Stack<String> opr=new Stack<>();
        
        for(char ch: s.toCharArray())
        {
            if(ch=='(')
                continue;
            else if(ch>='0' && ch<='9')
                postf+=(ch);
            else if(ch==')' && !opr.isEmpty())
				postf+="#"+(opr.pop())+"#";
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                postf+="#";
                opr.push(ch+"");
        	}
        }
        while(!opr.isEmpty())
        	postf+="#"+(opr.pop())+"#";
      	postf+="#";
   
        for(String ch: postf.split("#"))
       {           
           	if(ch.isEmpty() || ch.equals("#") || ch.equals(" ")) 
                continue;
			
          	else if(ch.equals("+") || ch.equals("-") || 
                  ch.equals("*") || ch.equals("/"))
        	{
                int a= Integer.parseInt(opr.pop());
                int b= Integer.parseInt(opr.pop());               
               if(ch.equals("+"))
               		opr.push((b+a)+"");
               else if(ch.equals("-"))
               		opr.push((b-a)+"");
               else if(ch.equals("*"))
                   opr.push((b*a)+"");  
               else 
                  opr.push((b/a)+"");  
            }               
           else 
               opr.push(ch);  
       }
        return Integer.parseInt(opr.pop());
    }
}

class Sol
{
    int countRev (String s)
    {
        // your code here  
        Stack<Character> st=new Stack<Character>();
        int oc=0,cc=0;
        
        for(char ch : s.toCharArray())
        {
            if(ch=='{')
            {
                st.push('{');
            }
            else
            {
                if( !st.isEmpty() && st.peek()=='{')
                    st.pop();
                else
                    st.push('}');
            }
        }

        while(!st.isEmpty())
        {
          char c= st.pop();  
        
          if(c=='{')
            oc++;
          else
            cc++;
        }
        
        if((oc+cc)%2!=0)
            return -1;
        
        return (int)(Math.ceil(oc/2.0) + Math.ceil(cc/2.0));
        
    }
}

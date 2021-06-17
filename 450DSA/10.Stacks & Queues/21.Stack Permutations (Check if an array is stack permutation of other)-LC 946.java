class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        if(pushed.length==0)
            return true;
        
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        st.push(pushed[i++]);
        
        while(i<=pushed.length)
        {
            while(!st.isEmpty() && popped[j]==st.peek().intValue())
            {
                j++;
                st.pop();
            }
            
            
            if(i<pushed.length)
                st.push(pushed[i]);
            
            i++;
        }
        
        if(j==popped.length)
            return true;
        
        return false;
        
    }
}

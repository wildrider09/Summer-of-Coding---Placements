class Solution {
    public String countAndSay(int n) {
        
         String output = "1";
        
         while(--n>0)  
             output = recursive(output);
        
         return output;
    
    }

        public String recursive(String input) 
        {
            
            char arr[]= input.toCharArray();
            char lastIc = arr[0];
            int count = 0;
            StringBuilder output = new StringBuilder();
            for (char ic : arr) 
            {
                
                if (ic == lastIc) 
                    count++;
                
                else
                {
                   output.append(count).append(lastIc);
                    count = 1;
                    lastIc = ic;
                }
            }
            
             output.append(count).append(lastIc);
                  
            return output.toString();
        }
}
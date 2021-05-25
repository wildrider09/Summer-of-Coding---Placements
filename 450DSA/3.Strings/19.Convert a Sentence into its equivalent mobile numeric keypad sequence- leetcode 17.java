class Solution {
    public List<String> letterCombinations(String digits) {
        
        String[][] map = {
                          {""},
                          {""},
                          {"a","b","c"},
                          {"d","e","f"},
                          {"g","h","i"},
                          {"j","k","l"},
                          {"m","n","o"},
                          {"p","q","r","s"},
                          {"t","u","v"},
                          {"w","x","y","z"}
                          };
        String[] s1 = {""};
        
        String[] res2 = {} ;
        
        for (char ch : digits.toCharArray()) 
        {
            int index = ch-'0';
            String[] s2 = map[index];
            res2 = interleave(s1, s2);
            s1 = res2;
        }
        
        return Arrays.asList(res2);
    }
    
        private String[] interleave(String[] a1, String[] a2) {
        
        String[] res = new String[a1.length*a2.length];
        
        int start = 0;
            
        for (int i = 0; i < a1.length; i++) 
            for (int j = 0; j < a2.length; j++) 
                res[start++] = a1[i] + a2[j];   
    
        return res;
    }
}

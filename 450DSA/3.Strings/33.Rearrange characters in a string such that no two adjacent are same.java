class Solution {
    public int minFlips(String str) {
        // Code here
      
        int cnt1 = 0, cnt2 = 0;
        char S[]=str.toCharArray();
        
        for (int i = 0; i < S.length; i++)
        {
            if (i % 2 == 0)
            {
                if (S[i] != '1')
                    cnt1++;
            }              

            else
            {
                if (S[i] != '0')
                    cnt1++;
            }
        }
        
        for (int i = 0; i < S.length; i++)
        {
            if (i % 2 == 0)
            {
                if (S[i] != '0')
                    cnt2++;
            }       

            else 
            {
                if (S[i] != '1')
                    cnt2++;
            }

        }
        
        return Math.min(cnt1, cnt2);

    }
    
}

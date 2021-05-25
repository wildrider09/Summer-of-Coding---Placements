class Solution {
      public int countBinarySubstrings(String s) 
      {
            int count = 0;
          
            int consecutiveCount = 1;
            int lastConsecutiveCount = 0;

            for (int i = 1; i < s.length(); i++)
            {
                if (s.charAt(i) != s.charAt(i-1))
                {
                    lastConsecutiveCount = consecutiveCount;
                    consecutiveCount = 1;
                    count++;
                }
                else
                {
                    consecutiveCount++;
                    if (consecutiveCount <= lastConsecutiveCount)  // 000111000
                        count++;
                }
            }

            return count;
        }

}


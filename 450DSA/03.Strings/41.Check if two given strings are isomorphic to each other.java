class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
        
          // Your code here
        int arr[]=new int[27];
        
        if(str1.length()!=str2.length())
            return false;
        
        for(int i=0;i< str1.length();i++)
        {
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(i);
            
            if(arr[ch1-'a'+1]==0)
                arr[ch1-'a'+1] = ch2-'a'+1;
            else
            {
                if(arr[ch1-'a'+1]==ch2-'a'+1)
                    continue;
                else
                    return false;
                 
            }
        }
        
        Arrays.fill(arr,0);
        
        for(int i=0;i< str2.length();i++)
        {
            char ch1=str2.charAt(i);
            char ch2=str1.charAt(i);
            
            if(arr[ch1-'a'+1]==0)
                arr[ch1-'a'+1] = ch2-'a'+1;
            else
            {
                if(arr[ch1-'a'+1]==ch2-'a'+1)
                    continue;
                else
                    return false;
                 
            }
        }
        
        return  true;
        
        
    }
}

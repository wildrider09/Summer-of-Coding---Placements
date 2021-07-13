class Solution
{
    //Function to find the largest number after k swaps.
    static String s;
    public static String findMaximumNum(String str, int k)
    {
        //code here.
        s=str;
        func(str.toCharArray(),k,0);
        return s;
    }
    
    public static void func(char str[],int k,int pos)
    {
        if(pos==k)
            return;
        
        for(int i=0;i<str.length;i++)
        {   
            for(int j=i+1;j<str.length;j++)
            {
                if(str[j]>str[i])
                {
                    char temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                    
                    if(String.valueOf(str).compareTo(s)>0)
                        s=String.valueOf(str);
                
                    func(str,k,pos+1);
                    
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
    }
}

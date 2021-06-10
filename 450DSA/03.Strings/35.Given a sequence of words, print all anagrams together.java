class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        
        // Your Code here
        
        String s[]=string_list.clone();
        int arr[]= new int[s.length];
        List<List<String>> list = new ArrayList<>();
        
        for(int i=0;i<s.length;i++)
        {
            char []ch=s[i].toCharArray();
            Arrays.sort(ch);
            s[i]= String.valueOf(ch);
        }
        int pos=0;
        
        for(int i=0;i<s.length;i++)
        {   
            if(arr[i]==0)
            {
                List<String> list1 = new ArrayList<String>();
                for(int j=i;j<s.length;j++)
                {
                    if(s[j].equals(s[i]))
                    {
                        
                        list1.add(string_list[j]);
                        arr[j]=1;    
                    }
                 
                }
                
                list.add(new ArrayList<String>(list1));
                
            }
        }
        
        
        return list;
    }
}

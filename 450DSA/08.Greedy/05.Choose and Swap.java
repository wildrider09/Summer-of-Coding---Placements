class Solution{
    
    
    String chooseandswap(String A){
        // Code Here
                
        TreeSet<Character> set=new TreeSet<>();
        int k=0,i=0;
        
        for(char ch : A.toCharArray())
            set.add(ch);
        
        List<Character> set1 = new ArrayList<Character>(set);
        
        while(k<set1.size() && i<A.length())
        {
            char ch=set1.get(k++);
            char ct=A.charAt(i++);
            
            if(ch<ct)
            {
                A=A.replaceAll(ch+"","#");
                A=A.replaceAll(ct+"",ch+"");
                A=A.replaceAll("#",ct+"");
                break;
            }
            else
            {
                while(i<A.length() && A.charAt(i)<=ch)
                {
                    i++;
                }
            }
        }    
            
        return A;
        
    }
}
    


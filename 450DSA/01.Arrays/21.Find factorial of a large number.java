class Solution {
    
    static ArrayList<Integer> factorial(int N)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        
        if(N<=1)    return list;
        
        for(int i=2;i<=N;i++)
        {
            int count=0;
            
            for(int j=list.size()-1;j>=0;j--)
            {
                int t=(list.get(j)*i)+count;
                
                list.remove(j);
                list.add(j,t%10);
                count=t/10;
            }
            
            while(count>0)
            {
                list.add(0,count%10);
                count=count/10;
            }
        }
        
        return list;
    }
}

class Solution{
    static int pageFaults(int N, int C, int pages[]){
        // code here
        int c=0,fault=0;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<N;i++)
        {
            if(list.contains(pages[i]))
            {
                list.remove(new Integer(pages[i]));
                list.add(pages[i]);
            }
            else if(c<C)
            {
                list.add(pages[i]);
                c++;fault++;
            }
            else if(c==C)
            {
                list.remove(0);
                list.add(pages[i]);
                fault++;
            }
        }
        return fault;
    }
}

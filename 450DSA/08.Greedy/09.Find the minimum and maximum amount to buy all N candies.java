class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        Arrays.sort(candies);
        
        int min=0,max=0,i=0,j=N-1;
        
        while(i<=j)
        {
            min+=candies[i];
            j-=K;
            i++;
        }
        
        i=0;j=N-1;
        while(i<=j)
        {
            max+=candies[j];
            i+=K;
            j--;
        }
    
        list.add(min);list.add(max);
            
        return list;
    }
    
}

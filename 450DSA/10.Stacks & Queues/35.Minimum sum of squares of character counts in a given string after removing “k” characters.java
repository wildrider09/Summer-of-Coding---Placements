class Compare implements Comparator<Integer>
    {
        public int compare(Integer a,Integer b) {
            return b-a;
        }
    }
    

class Solution{
    
    
    static int minValue(String s, int k){
        // code here
        
        int arr[] = new int[26];
        int min=0;
        
        for(char i: s.toCharArray())
            arr[i-'a']++;
        
        PriorityQueue<Integer> q=new PriorityQueue<>(1, new Compare());
        
        for(int i=0;i<arr.length;i++)
            q.add(arr[i]);
            
        while(k-->0)
        {
            int t=q.remove();
            t--;
            q.add(t);
        }
        
        while(!q.isEmpty())
        {
            min+=(int)Math.pow(q.remove(),2);
        }
        
        return min;
    }
}

class Solution {
    public int canCompleteCircuit(int[] petrol, int[] distance) {
     
        int n=petrol.length;
        int start=0,surplus=0,deficit=0;
        
        for(int i=0;i<n;i++)
        {
            surplus+=petrol[i]-distance[i];
            if(surplus<0)
            {
                start=i+1;
                deficit+=surplus;
                surplus=0;
            }
        }
        
        if(start==n || (surplus+deficit)<0 )
            return -1;
        else
            return start;
    }  
}

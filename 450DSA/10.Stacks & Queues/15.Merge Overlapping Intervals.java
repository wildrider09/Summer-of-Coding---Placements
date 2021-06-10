class Solution
{
    class Compare implements Comparator<int[]>
    {
        public int compare(int a[],int b[])
        {
            return a[0]-b[0];
        }
    }
    
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here
        List<int[]> list=new ArrayList<>();
        
        Arrays.sort(Intervals,new Compare());
        
        int v1=Intervals[0][0];
        int v2=Intervals[0][1];
        
        
        for(int i=1;i<Intervals.length;i++)
        {
            if(v2>=Intervals[i][0] && v2>=Intervals[i][1])
                continue;
            else if(v2>=Intervals[i][0] && v2<Intervals[i][1])
            {
                v2=Intervals[i][1];
            }
            else if(v2<Intervals[i][0])
            {
                list.add(new int[]{v1,v2});
                v1=Intervals[i][0];
                v2=Intervals[i][1];
            }
        }
        
        list.add(new int[]{v1,v2});
        
        return list.toArray(new int[0][]);
    }
}

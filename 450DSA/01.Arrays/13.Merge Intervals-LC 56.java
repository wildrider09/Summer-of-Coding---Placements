class Solution {
    public int[][] merge(int[][] intervals) {
        
        ArrayList<int[]> list=new ArrayList<>();
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0],end=intervals[0][1];
       
        for(int i=1;i<intervals.length;i++)
        {
            if(end>=intervals[i][0] && end>=intervals[i][1])
                continue;
            
            else if(end>=intervals[i][0] && end<intervals[i][1])
                end=intervals[i][1];
            
            else
            {
                list.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }   
        list.add(new int[]{start,end});
        
        int arr[][]=new int[list.size()][2];
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=list.get(i)[0];
            arr[i][1]=list.get(i)[1];
        }
        return arr;
    }
}

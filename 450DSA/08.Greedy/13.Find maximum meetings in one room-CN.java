import java.util.*;
public class Solution {

    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        //Write your code here
           // add your code here
        List<Integer> list=new ArrayList<>();
        int begin=0,n=start.length;
        int arr[][]=new int[n][3];
        
        for(int i=0;i<n;i++)
        {
            arr[i][0]=start[i];
            arr[i][1]=end[i];
            arr[i][2]=i+1;
        }
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        
        begin=arr[0][1];
        list.add(arr[0][2]);
        for(int i=1;i<n;i++)
        {
            if(begin < arr[i][0])
            {
                list.add(arr[i][2]);
                begin=arr[i][1];
            }
        }
        return list;
    }

}

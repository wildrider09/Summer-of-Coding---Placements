class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i,j,max=m-1,row=0;
    
        for(i=0;i<n;i++)
        {
            for(j=max;j>=0;j--)
            {
                if(arr[i][j]==1)
                    continue;
                else
                    break;
            }
            if(j < max)
            {
                max=j;
                row=i;
            }
        }
        if(max==m-1)
            return -1;
        return row;
      
    }
}

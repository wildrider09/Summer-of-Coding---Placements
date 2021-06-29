//time O(n2),space O(1)-use same array
public class Solution {
    public static int findMaxValue(int arr[][], int n) {
        // Write your code here.
        int maximum=arr[n-1][n-1];
        for(int i=n-1;i>=0;i--)
        {
            maximum=Math.max(maximum,arr[n-1][i]);
       		arr[n-1][i]=maximum;
        }
        
        maximum=arr[n-1][n-1];
        for(int i=n-1;i>=0;i--)
        {
            maximum=Math.max(maximum,arr[i][n-1]);
          	arr[i][n-1]=maximum;
        }
        
        maximum=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
                if(arr[i+1][j+1]-arr[i][j]>maximum)
                    maximum=arr[i+1][j+1]-arr[i][j];
                
                arr[i][j]=Math.max(arr[i][j],
                          Math.max(arr[i+1][j],arr[i][j+1]));
            }
        }
        return maximum;
    }
}


//time O(n2),space O(n2)
public class Solution {
    public static int findMaxValue(int arr[][], int n) {
        // Write your code here.
        int dp[][]=new int[n][n];
        int maximum=arr[n-1][n-1];
        dp[n-1][n-1]=arr[n-1][n-1];
        
        for(int i=n-1;i>=0;i--)
        {
            maximum=Math.max(maximum,arr[n-1][i]);
       		dp[n-1][i]=maximum;
        }
        
        maximum=arr[n-1][n-1];
        for(int i=n-1;i>=0;i--)
        {
            maximum=Math.max(maximum,arr[i][n-1]);
          	dp[i][n-1]=maximum;
        }
        
        maximum=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
                if(dp[i+1][j+1]-arr[i][j]>maximum)
                    maximum=dp[i+1][j+1]-arr[i][j];
                
                dp[i][j]=Math.max(arr[i][j],
                          Math.max(dp[i+1][j],dp[i][j+1]));
            }
        }
        return maximum;
    }
}


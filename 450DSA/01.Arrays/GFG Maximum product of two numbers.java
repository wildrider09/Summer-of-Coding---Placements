class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        int max1,max2;
        
        max1= arr[0]>arr[1] ? arr[0]: arr[1];
        max2= arr[0]<arr[1] ? arr[0]: arr[1];
        
        for(int i=2;i<n;i++)
        {
            if(arr[i]>=max1)
            {
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>=max2 && arr[i]<=max1)
                max2=arr[i];
        }
      
        return max1*max2;
    }
}

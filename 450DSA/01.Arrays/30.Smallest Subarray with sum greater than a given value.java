class Solution {

    public static int sb(int arr[], int n, int x) {
        // Your code goes here 
        int sum=0,i=0,j=0,count=0,min=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            sum+=arr[i];
            count++;
            
            if(sum>x)
                min=Math.min(min,count);
           
            while(sum-arr[j]>x)
            {
                sum-=arr[j++];
                count--;
                min=Math.min(min,count);
            }
        }
        return min;
    }
}



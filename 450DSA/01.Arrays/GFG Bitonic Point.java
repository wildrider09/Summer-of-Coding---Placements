class Solution {
    int findMaximum(int[] arr, int n) {
     
        int start = 0;
        int end = n - 1;
        while(start < end)
        {
            int mid = (start + end) / 2;
            
            if(arr[mid] >= arr[mid + 1]) 
                end = mid;
            else 
                start = mid + 1;
        }
        
        return arr[end];
    }
}

class Solution {
    public void moveZeroes(int[] arr) {
        
        int i=0,j=0,n=arr.length;
        
        while(i<n && j<n)
        {
            
            if(i>j && arr[i]!=0 && arr[j]==0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            
            if(arr[j]!=0)    
                j++;
            
            if((i<=j) || (i<n && arr[i]==0))
                i++;
        
        }
        
    }
}

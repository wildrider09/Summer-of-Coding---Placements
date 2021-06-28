class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int i=n-1,j=0;
        
        while(i>-1 && j<m)
        {
            if(arr1[i]>arr2[j])
            {
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i--;j++;
            }
            else 
                break;
            
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}

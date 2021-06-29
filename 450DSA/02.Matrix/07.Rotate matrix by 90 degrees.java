class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int arr[][], int n) 
    { 
        // code here
        
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[n-i-1][j];
                arr[n-i-1][j]=temp;
            }
        }    
    }
}

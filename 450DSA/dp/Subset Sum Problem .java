class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        
        int i=0,j=0;
        
        N=sum;
        int t[][]=new int[102][100002];
        
        for( j = 0 ; j< N+1 ; j++) t[0][j] = 0;
        for( i = 0 ; i< arr.length+1 ; i++) t[i][0] = 1;
            
        for( i=1;i< arr.length+1;i++)
            {
                for( j=1;j< N+1;j++)
                {
                    if(arr[i-1]<=j)
                        t[i][j]= t[i-1][j-arr[i-1]] | t[i-1][j] ;
                    else
                        t[i][j]= t[i-1][j] ;
                    
                }
            }
            
        return t[arr.length][N]==1 ? true:false;
 
    }
}
class Solution {
    int median(int mat[][], int r, int c) {
        // code here
         int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        
        for(int i=0;i<r;i++)
            low=Math.min(low,mat[i][0]);
        
        for(int j=0;j<r;j++)
            high=Math.max(high,mat[j][c-1]);
            
    
        int k=(r*c)/2+1;
        while(low<high)
	{            
            int mid=(high+low)/2;
            int cnt=count(mat,mid);
            if(cnt<k)
                low=mid+1;
        
            else
                high=mid;
                
        }
        
        return high;
    }
    
    int count(int[][]mat,int x){
        
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            int ind=Arrays.binarySearch(mat[i],x);
            if(ind<0)
                ind=Math.abs(ind+1);
            else
            {
                while(ind<mat[0].length && mat[i][ind]==x)
                    ind++;
            }
            c+=ind;
        }
        return c;
    }
        
}

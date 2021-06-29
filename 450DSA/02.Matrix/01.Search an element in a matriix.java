class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i;
        for(i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target)
                break;
        }
        
        if(i==matrix.length)
            return false;
        
        int t=Arrays.binarySearch(matrix[i],target);
        
        if(t>=0)
            return true;
        
        return false;
        
    }
}

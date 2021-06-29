//time O(K log(n)) space O(n), also worst case k=n2
class Solution {
     static class Pair
    {
        int row,index,data;
        public Pair(int r,int i,int d)
        {
            row=r;
            index=i;
            data=d;
        }
    }
    
	 public int kthSmallest(int[][] mat, int k) {
    
        //code here.
        int n=mat.length;
        PriorityQueue<Pair> q=new PriorityQueue<>(1,(a,b)->a.data-b.data);
        int count=0;
        
        for(int i=0;i<n;i++)
            q.add(new Pair(i,0,mat[i][0]));
        
        while(count<k)
        {
            Pair temp=q.poll();
            count++;
            if(count==k)
                return temp.data;
                
            if(temp.index<n-1)
            {
                q.add(new Pair(temp.row,temp.index+1,mat[temp.row][temp.index+1]));
            }
        }
        
        return 0;
    }
}


//time O(n log(max range)), space O(1)
class Solution {
    
	 public int kthSmallest(int[][] mat, int k) {
    
         int n=mat.length,ans=0;
         int low=mat[0][0],high=mat[n-1][n-1];
         while(low<=high)
         {
             int mid=(low+high)/2;
             int count=count(mat,mid);
             if(count<k)
                 low=mid+1;
             else{
                 
                 high=mid-1;
            }
         }
         return low;
         
    }
    
    public int count(int arr[][],int x)
    {
        int row=arr.length-1,col=0,count=0;
        while(row>=0 && col<arr.length)
        {
            if(arr[row][col]>x)
                row--;
            else
            {
                count+=row+1;
                col++;
            }
        }
        return count;
    }
}

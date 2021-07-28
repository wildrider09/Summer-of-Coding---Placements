class Solution
{
    static long count=0;
    static long inversionCount(long arr[], long N)
    {
        count=0;
        MergeSort(arr,0,(int)N-1);
        return count;
    }
    
    static void MergeSort(long arr[],int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            Merge(arr,l,r);
        }
    }
    
    static void Merge(long arr[],int l,int r)
    {
        long temp[]=new long[r-l+1];
        
        int mid=(l+r)/2;
        int i=0,p1=l,p2=mid+1;
        
        while(p1<=mid && p2<=r)
        {
            if(arr[p1]<=arr[p2])
                temp[i++]=arr[p1++];
            
            else
            {
                count+=(mid-p1+1);
                temp[i++]=arr[p2++];
            }
        }
        
        while(p1<=mid)
            temp[i++]=arr[p1++];
        
        while(p2<=r)
            temp[i++]=arr[p2++];
            
        for(int k=0;k<temp.length;k++)
            arr[l++]=temp[k];
            
    }
}

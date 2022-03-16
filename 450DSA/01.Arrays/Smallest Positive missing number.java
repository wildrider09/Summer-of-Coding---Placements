//O(n) time && O(1) space
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int i=0;
        
        for(i=0;i<size;i++)
            if(arr[i]==1)
                break;
        
        if(i==size)
            return 1;
            
        for(i=0;i<size;i++)
            if(arr[i]<=0 || arr[i]>size)
                arr[i]=1;
        
        for(i=0;i<size;i++)
            arr[(arr[i]-1)%size]+=size;
        
        for(i=0;i<size;i++)
            if(arr[i]<=size)
                return i+1;
        
        return size+1;
        
    }
}


//O(n) time && O(n) space
class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int present[]=new int[size+1];
        
        for(int i=0;i<size;i++)
        {
            if(arr[i]>0 && arr[i]<=size)
                present[arr[i]]=1;
        }
        
        for(int i=1;i<=size;i++)
        {
            if(present[i]==0)
                return i;
        }
        
        return size+1;
        
    }
}
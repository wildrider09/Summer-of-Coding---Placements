class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int count=0;
        int arr[]=nums.clone();
        Arrays.sort(arr);
        
        for(int i=0;i<nums.length;i++)
        {
            int t=Arrays.binarySearch(arr,nums[i]);
            if(t!=i)
            {
                count++;
                int k=nums[t];
                nums[t]=nums[i];
                nums[i]=k;
                i--;
            }
        }
        return count;
    }
}

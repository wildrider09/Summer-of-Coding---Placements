class Solution {
    public void nextPermutation(int[] nums) 
    {
        int i,j,temp,lowest=0,n=nums.length,pos  = 0;
    
        
        for( i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                pos=i;
                break;
            }
        }
        
        if(i==-1){
            Arrays.sort(nums);
            return;
        }
        
        
        for( i=n-1;i>pos;i--)
        {
            if(nums[i]>nums[pos])
            {
                lowest=i;
                break;
            }
        }
        
        // swap(nums,lowest,pos);        
        temp=nums[lowest];
        nums[lowest]= nums[pos];
        nums[pos]=temp;
        
        for(i=pos+1,j=n-1;i<j;i++,j--)
        {
            temp=nums[i];
            nums[i]= nums[j];
            nums[j]=temp;
        }
        
      
        
        
    }
}

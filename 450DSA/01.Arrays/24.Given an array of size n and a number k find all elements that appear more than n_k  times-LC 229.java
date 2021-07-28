class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list=new ArrayList<>();
        
        if(nums.length==1)
        {
            list.add(nums[0]);
            return list;
        }
        
        int number1=nums[0],number2=nums[0];
        int count1=0,count2=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==number1)
                count1++;
            
            else if(nums[i]==number2)
                count2++;
            
            else if(count1==0)
            {
                number1=nums[i];
                count1++;
            }
            
            else if(count2==0)
            {
                number2=nums[i];
                count2++;
            }
            
            else
            {
                count1--;
                count2--;
            }
        }
        
        count1=0;count2=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(number1==nums[i])
                count1++;
            else if(number2==nums[i])
                count2++;
        }
        
        if(count1>nums.length/3)  list.add(number1);
            
        if(count2>nums.length/3)  list.add(number2);
        
        return list;
    }
}

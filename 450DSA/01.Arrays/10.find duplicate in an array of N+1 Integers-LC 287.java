//GFG Find duplicates in an array 

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int c = 1;
        for(int i = 0; i < n; i++)
        {
            int ind = arr[i] % n;
            arr[ind] += n;
            if(arr[ind]/n == 2)
            {
                list.add(arr[i]%n);
            }
        }
        if(list.isEmpty())
            list.add(-1);
        
        Collections.sort(list);
        return list;
    }
}

class Solution 
{
     public int findDuplicate(int[] nums)
     {
        int slow=nums[0];
        int fast=nums[0];

        do
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
         while(slow!=fast);
       
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
     }
}

class Solution {
    public void rotate(int[] nums, int k) {
        
        int len = nums.length;
        k %= len;
		
		
		// rotate 1st part(i.e. from 0 length to length - k - 1) -> 1, 2, 3, 4 --> 4, 3, 2, 1
        rotate(nums, 0, len - k - 1);
		
		// rotate 2nd part(i.e. from  length - k to length - 1) -> 5, 6, 7 --> 7, 6, 5
        rotate(nums, len - k, len - 1);
		
		// rotate whole array -> 4, 3, 2, 1, 7, 6, 5 --> 5, 6, 7, 1, 2, 3, 4 ==> Desired output
        rotate(nums, 0, len - 1);
        
    }
    public static void rotate(int[] nums, int start, int end){
        int temp;
        while(start < end){
            temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}

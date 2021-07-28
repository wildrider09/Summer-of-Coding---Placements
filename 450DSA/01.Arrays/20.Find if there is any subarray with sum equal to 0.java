class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        Set< Integer > set = new HashSet<>();
        int sum = 0;
        for (int a : arr) 
        {
            sum += a;
            if (set.contains(sum) || a == 0 || sum == 0) 
                return true;
            
            set.add(sum);
        }
        
        return false;
    }
    
}

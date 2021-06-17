class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        boolean done[] =new boolean[100];//100max deadline given  // or try [min(n,100)]
        int day = 0, profit = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = arr[i].deadline-1; j >= 0; j--)  //or try j=min(n-1,arr[i].deadline-1)
            {
                if(done[j] == false)
                {
                    day += 1;
                    profit += arr[i].profit;
                    done[j] = true;
                    break;
                }
            }
        }
        return new int[]{day,profit};
    }
}

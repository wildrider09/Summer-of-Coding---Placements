class Solution
{
    class Compare implements Comparator<Item>
    {
        public int compare(Item a,Item b)
        {
            double b_vbw=(b.value/(b.weight*1.0));
            double a_vbw=(a.value/(a.weight*1.0));
            if(b_vbw>a_vbw)
                return 1;
            else
                return -1;
        }
    }
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        int tw=0,i=0;
        double profit=0;
        Arrays.sort(arr,new Compare());
        
        while(i<n && tw<W)
        {
            
            if(tw+arr[i].weight<=W)
            {
                tw+=arr[i].weight;
                profit+=arr[i].value;
            }
            else
            {
                double temp=W-tw;
                tw+=temp;
                profit+=( (arr[i].value/(arr[i].weight * 1.0)) * temp);
            }
            i++;
        }
        return profit;
    }
}

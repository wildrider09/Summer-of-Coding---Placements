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



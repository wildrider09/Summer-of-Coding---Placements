
class Solution
{
    static ArrayList<ArrayList<Integer>>ans;
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        ans = new ArrayList<>();
        
        ArrayList<Integer> D = new ArrayList<>();
        for(int x : A)
            if(!D.contains(x)) D.add(x);
        
        int arr[] = D.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        
        findCombo(0,arr,B,new ArrayList<>(),arr.length);
        return ans;
        
    }
    
    static void findCombo(int pos,int arr[],int target,ArrayList<Integer> list,int n)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        if(pos==n || target<0)
        {
            return;
        }
        
        if(target-arr[pos]>=0)
        {
            list.add(arr[pos]);
            findCombo(pos,arr,target-arr[pos],list,n);
            list.remove(list.size()-1);
        }
        
        findCombo(pos+1,arr,target,list,n);
    }
}

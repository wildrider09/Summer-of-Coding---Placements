
class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code ue()
        Map<String,Integer> list= new HashMap<String,Integer>();
        int high=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!list.containsKey(arr[i]))
            {
                list.put(arr[i],1);
            }
            else
            {
                list.put(arr[i],list.get(arr[i])+1);
                
                if(high<list.get(arr[i]))
                    high=list.get(arr[i]);
            }
            
        }
        
        String s="";int high1=0;
        for (Map.Entry<String,Integer> entry : list.entrySet())
        {
            if(high1 < entry.getValue() && entry.getValue() < high)
            {
                high1=entry.getValue();
                s= entry.getKey();
            }
        }
        
        return s;
    }
}

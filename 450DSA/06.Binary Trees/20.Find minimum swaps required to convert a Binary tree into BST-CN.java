import java.io.*;
import java.util.*;
public class Solution {

    static ArrayList<Integer> list;
    static int swaps;
    
    public static int minimumSwaps(ArrayList<Integer> arr, int n) 
    {
    
        list=new ArrayList<>();
        swaps=0;
        inorder(arr,n,0);
        swap();
        return swaps;
    }
    static void inorder(ArrayList<Integer> arr,int n,int index)
    {
        if(index>=n)
            return ;
        inorder(arr,n,2*index+1);
        //System.out.println(arr.get(index));
        list.add(arr.get(index));
        inorder(arr,n,2*index+2);
    }
    static void swap()
    {
        int arr[]=list.stream().mapToInt(Integer::intValue).toArray();
        int sort[]=arr.clone();
        Arrays.sort(sort);
 		for(int i=0;i<arr.length;i++)
        {
            int t=Arrays.binarySearch(sort,arr[i]);
            if(t!=i)
            {
                int temp=arr[t];
                arr[t]=arr[i];
                arr[i]=temp;
                swaps++;
                i--;
            }
        }
    }
}


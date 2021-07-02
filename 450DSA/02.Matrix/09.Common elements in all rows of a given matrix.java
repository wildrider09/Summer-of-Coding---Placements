//if all rows are sorted then use
/* Merge Sort combine() on all rows: time O(mn), space O(n)
We can solve this problem in O(mn) time using the approach similar to merge of Merge Sort. The idea is to start from the last column of every row. If elements at all last columns are same, then we found the common element. Otherwise we find the minimum of all last columns. Once we find a minimum element, we know that all other elements in last columns cannot be a common element, so we reduce last column index for all rows except for the row which has minimum value. We keep repeating these steps till either all elements at current last column don’t become same, or a last column index reaches 0. */

//if rows sorted or not sorted use hashmap: time O(mn), space O(n)


import java.util.ArrayList;
import java.util.HashMap;

public class Solution
{
    public static ArrayList<Integer> findCommonElements(ArrayList<ArrayList<Integer>> mat)
    {
        // Finding the number of rows and columns
        int n = mat.size();
        int m = mat.get(0).size();
	
	HashMap<Integer, Integer> commonElements = new HashMap<Integer, Integer>();
        
        for (int j = 0; j < m; j++)
        {
            commonElements.put(mat.get(0).get(j), 1);
        }
        
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (commonElements.get(mat.get(i).get(j)) != null && commonElements.get(mat.get(i).get(j)) == i)
                {
                    commonElements.put(mat.get(i).get(j), i + 1);
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for (HashMap.Entry mp : commonElements.entrySet())  //traversal done separately to handle single row case
        {
            // Adding all elements that are present in all the matrix rows to the output array
            if ((int)mp.getValue() == n)
                ans.add((int)mp.getKey());
        }
        return ans;
    }
}

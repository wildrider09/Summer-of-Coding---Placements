import java.io.*;
import java.util.*;
 
public class GFG {
 
    public static int minOps(String A, String B)
    {
         
        if(A.length() != B.length())
            return -1;
         
        int i, j, count = 0;
 
        int arr [] = new int [128];
         
        for(i = 0; i < A.length(); i++)
        {
            arr[A.charAt(i)]++;
            arr[B.charAt(i)]--;
        }
         
        for(i = 0; i < 128; i++)
            if(arr[i] != 0)
                return -1;
         
        i = A.length() - 1;
        j = i;
 
        while(i >= 0 && j>=0)
        {
            if(A.charAt(i) != B.charAt(j))
            {
               count++;
               i--;
            }
         
            else
            {
                j--;
                i--;        
            }
        }    
        return count;    
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String A = "EACBD";
        String B = "EABCD";
         
        System.out.println("Minimum number of "
                    + "operations required is "
                                 + minOps(A, B));
    }
}

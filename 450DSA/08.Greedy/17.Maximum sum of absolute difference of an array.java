import java.io.*;
import java.util.*;

public class GFG {
	
	static int MaxSumDifference(int []a, int n)
	{
	    Arrays.sort(a);
	    int max=0,i=0,j=n-1,k=0,count=0;
	    int arr[]=new int[n];
	    
	    while(i<=j)
	    {   
	        if(count++%2==0)
	            arr[k++]=a[i++];
	        else
	            arr[k++]=a[j--];
	       
	       System.out.println(arr[k-1]);
	    }
	    
	    for(i=1;i<n;i++)
	        max+=Math.abs(arr[i]-arr[i-1]);
	    
	    max+=Math.abs(arr[0]-arr[n-1]);
    	return max;
	}
	
	public static void main(String args[])
	{
		int []a = { 1, 2, 3, 4, 5  };
		int n = a.length;
	
		System.out.print(MaxSumDifference(a, n));
	}
}


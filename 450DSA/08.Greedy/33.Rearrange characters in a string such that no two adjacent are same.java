import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    int flag=0;
		    int a[]=new int[26];
		    for(char ch : s.toCharArray())
		    {
		        a[ch-'a']++;
		    }
		    for(int i : a)
		    {
		        if( i > (int)Math.ceil(s.length()/2.0) )
		           {
		               flag=1;
		               System.out.println("0");
		           }
		    }
		    if(flag==0)
		        System.out.println("1");
		}
	}
}

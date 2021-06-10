class GFG
{

    static int runCustomerSimulation(int n, char []seq)
    {
	    int []seen = new int[26];
	    int count = 0 , res = 0; 

	    for (char ch: String.valueOf(seq).toCharArray())
	    {
		   if (seen[ch-'A'] == 0)
		   {
			seen[ch-'A'] = 1;
			if (count < n)
			   {
			       count++;
			       seen[ch-'A']=2;
			   }
			else
			    res++;
		    }

		    else
		    {
			
		    if (seen[ch-'A'] == 2)
			    count --;
		    
		    seen[ch-'A'] = 0;
		    }
	    }
	    
	    return res;
    }

    public static void main(String[] args)
    {
	
	System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ".toCharArray()));
	System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE".toCharArray()));
	System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE".toCharArray()));
	System.out.println(runCustomerSimulation(1, "ABCBCA".toCharArray()));
	System.out.println(runCustomerSimulation(1, "ABCBCADEED".toCharArray()));
    }
 }


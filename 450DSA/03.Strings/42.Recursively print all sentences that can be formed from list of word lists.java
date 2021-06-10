import java.util.Arrays;
import java.util.List;

class Main
{
	static int listsize;
	
	public static void printAllCombinations(List<List<String>> list,String result, int n)
	{
		if(n==listsize)
		{
			System.out.println(result.substring(1));
			return;
		}
		
		
		int size=list.get(n).size();
		
		
		for(int i=0;i<size;i++)
			printAllCombinations(list,result+" "+list.get(n).get(i),n+1);
		
		
		
	}

	public static void main(String[] args)
	{
		List<List<String>> list = Arrays.asList(
						Arrays.asList("she","Ram"),
						Arrays.asList( "Plays","Watches","Fucks" ),
						Arrays.asList( "Cricket","Hers" )
					);
		listsize=list.size();
		
		printAllCombinations(list, "", 0);
	}
}

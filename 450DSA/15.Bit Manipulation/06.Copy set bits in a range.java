import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int y = scn.nextInt();
    int x = scn.nextInt();
    int l = scn.nextInt();
    int r = scn.nextInt();
    
    if (l < 1 || r > 32)
		return ;

	// get the length of the mask
	int tmask = (1<<(r-l+1)) - 1;
	
	int mask = ((tmask)<<(l-1)) & y ;
	
	x = x | mask;
	
	System.out.println(x);

    
  }

}

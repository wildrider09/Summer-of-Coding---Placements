import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int[] val) {
    // write your code here
     // code here
        int t[][]=new int[1002][1002];
        int N=val.length;
        for(int i=0;i<N+1;i++)
            t[i][0]=0;
        for(int i=0;i<N+1;i++)
            t[0][i]=0;
        for(int i=1;i<N+1;i++)
            {
                for(int j=1;j<N+1;j++)
                {
                    if(i<=j)
                        t[i][j]=Math.max(val[i-1]+t[i][j-i],t[i-1][j]);
                
                    else
                        t[i][j]=t[i-1][j];
                }
            }
            return t[N][N];
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] prices = new int[n];
    for (int i = 0; i < n; i++) {
      prices[i] = scn.nextInt();
    }
    System.out.println(solution(prices));
  }
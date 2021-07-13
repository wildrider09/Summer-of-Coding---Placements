import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cur_row=sc.nextInt();
        int cur_col=sc.nextInt();
        
        int chess[][]=new int[n][n];
        chess[cur_row][cur_col]=1;
        
        int row[]={-2,-1,1,2,2,1,-1,-2};
        int col[]={1,2,2,1,-1,-2,-2,-1};
        
        printKnightsTour(chess,row,col,cur_row,cur_col,2,n);
    }

    public static void printKnightsTour(int[][] chess,int row[],int col[], int cur_row, int cur_col, int nextMove,int n) {
        
        if(nextMove==n*n+1)
            displayBoard(chess);
            
        for(int i=0;i<8;i++)
        {
            if(isValid(chess,cur_row+row[i],cur_col+col[i],n))
            {
                chess[cur_row+row[i]][cur_col+col[i]]=nextMove;
                
                printKnightsTour(chess,row,col,cur_row+row[i],cur_col+col[i],nextMove+1,n);
               
                chess[cur_row+row[i]][cur_col+col[i]]=0;
                
            }
        }
    }
    
    public static boolean isValid(int chess[][],int r,int c,int n)
    {
        if(r<0 || r>=n || c<0 || c>=n || chess[r][c]!=0)
            return false;
        
        else
            return true;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

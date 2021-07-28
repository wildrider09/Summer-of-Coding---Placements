import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String args[])throws IOException
    { 
        Scanner sc=new Scanner(System.in);       
        int n=sc.nextInt();
        Player players[]=new Player[n];
        
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();sc.nextLine();
            String d=sc.nextLine();
            String e=sc.nextLine();
            players[i]=new Player(a,b,c,d,e);
            
        }
        
        int ss=sc.nextInt();
        
        Player t=findPlayerWithMinimumMAtchesPlayed(players);
        if(t==null)
            System.out.println("No Player found with mentioned attribute");
        else
        {
            System.out.println("id-"+t.id);
            System.out.println("matchesPlayed-"+t.matchesPlayed);
            System.out.println("totalRuns-"+t.totalRuns);
            System.out.println("name-"+t.name);
            System.out.println("team-"+t.team);
            
        }
        
        Player tt=searchPlayerById(players,ss);
        if(tt==null)
            System.out.println("No Player found with mentioned attribute");
        else
        {
            System.out.println("id-"+tt.id);
            System.out.println("matchesPlayed-"+tt.matchesPlayed);
            System.out.println("totalRuns-"+tt.totalRuns);
            System.out.println("name-"+tt.name);
            System.out.println("team-"+tt.team);
            
        }
        
    }
    
    public static Player findPlayerWithMinimumMAtchesPlayed(Player[] players)
    {
        if(players.length>0)
        {
            int tmp=Integer.MAX_VALUE;
            Player t=null;
            for(int i=0;i<players.length;i++)
            {
                if(tmp>players[i].matchesPlayed)
                {
                    tmp=players[i].matchesPlayed;
                    t=players[i];
                }
            }
            return t;
        }
        
        else 
            return null;
        
    }
    
    public static Player searchPlayerById(Player[] players,int ss)
    {
        for(int i=0;i<players.length;i++)
        {
             if(players[i].id==ss)
                return players[i];
        }
        
        return null;
    }
}

class Player
{
    int id,matchesPlayed,totalRuns;
    String name,team;
    
    Player(int a,int b,int c,String d,String e)
    {
        id=a;
        matchesPlayed=b;
        totalRuns=c;
        name=d;
        team=e;
    }

}


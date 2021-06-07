import java.util.*;
import java.io.*;
class Tickets
{
    private int empId,ticketNo,ticketAssigned;
    private String empName;
    
    public Tickets(int empId,int ticketNo,int ticketAssigned,String empName)
    {
        this.empId=empId;
        this.ticketNo=ticketNo;
        this.ticketAssigned=ticketAssigned;
        this.empName=empName;
    }
    private static int getTicketNo(Tickets arr[],int x)
    {
        int m=0;
        for(int i=0;i<4;i++)
        {
            if(arr[i].empId==x)
                m=arr[i].ticketNo;
        }
        return m;
    }
    private static Tickets getThirdHighestTicketAssigned(Tickets arr[])
    {
        int temp[]=new int[4];
        for(int i=0;i<4;i++)
        {
            temp[i]=arr[i].ticketAssigned;
        }
        Arrays.sort(temp);
        for(int i=1;i<4;i++)
        {
            if(temp[i]==temp[i-1])
                return null;
        }
        int x=temp[1];
        
        for(int i=0;i<4;i++)
            if(arr[i].ticketAssigned==x)
                return arr[i];
                
        return null;
    }
    public static void main(String args[])throws IOException
    {
    	InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
    	int k=0;
    	Tickets arr[]=new Tickets[4];
    	for(int i=0;i<4;i++)
    	{
    	   int a=Integer.parseInt(br.readLine());
    	   String b=br.readLine();
    	   int c=Integer.parseInt(br.readLine());
    	   int d=Integer.parseInt(br.readLine());
    	   arr[k++]=new Tickets(a,c,d,b);
    	}
    	int need=Integer.parseInt(br.readLine());
    	int t=getTicketNo(arr,need);
    	if(t>0)
    	    System.out.println(t);
        else
            System.out.println("Incorrect employee id");
            
    	Tickets t1=getThirdHighestTicketAssigned(arr);
    	
    	if(t1==null)
    	     System.out.println("No Ticket available");
    	else
    	{
    	     System.out.println(t1.empId); 
    	     System.out.println(t1.ticketAssigned);
    	}
    	    
    }
}


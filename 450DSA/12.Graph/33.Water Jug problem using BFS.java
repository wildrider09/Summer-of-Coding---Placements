class Solution
{
    public int  minSteps(int m, int n, int d)
    {
        // code here
        
        int gcd=gcd(m,n);                    
                                            
        if(d%gcd!=0 || d>n)
            return -1;
        
        return Math.min(pour(m,n,d),pour(n,m,d));
    }
        
    int pour(int m,int n,int d)
    {
        int jug1=0,jug2=0,steps=0;
                                            //m=3 n=5
        while(jug1!=d && jug2!=d)           //jug1=2   jug2=5   steps=5
        {
            if(jug2==0)
            {
                jug2=n;
                steps++;
            }
            
            else if(jug1==m)
            {
                jug1=0;
                steps++;
            }
            
            else
            {   
                int temp=Math.min(jug2,m-jug1);
                jug2-=temp;
                jug1+=temp;
                steps++;
            }
        }
        
        return steps;
    }
    
    int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}

//BFS


class Solution{
    
    static int t[][]=new int[501][501];
    
    static int palindromicPartition(String str)
    {
        // code here
        for(int i=0;i<501;i++)
            Arrays.fill(t[i],-1);
            
        return palin(str,0,str.length()-1);
    }
    
    static int palin(String str,int i,int j)
    {
        if(i>=j)
            return 0;
            
        if(t[i][j]!=-1)
            return t[i][j];
        
        int ti=i,tj=j,k,temp1,temp2;
        int ans=Integer.MAX_VALUE;    
        while (ti <= tj) 
        {
            if (str.charAt(ti) != str.charAt(tj))
                break;
            ti++;tj--;
                
        }
        if(ti>tj)
            return 0;
            
        for( k=i;k<j;k++)
        {   
            if(t[i][k]!=-1)
                temp1=t[i][k];
            else
                {
                    temp1=palin(str,i,k);
                    t[i][k]=temp1;
                }                
            if(t[k+1][j]!=-1)
                temp2=t[k+1][j];
            else
                {
                    temp2=palin(str,k+1,j);
                    t[k+1][j]=temp2;
                }
            ans=Math.min(ans,1+temp1+temp2);
        }
        return t[i][j]=ans;
    }
}
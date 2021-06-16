class Solution {
   
    String solve(int[] arr, int n) {
        // code here
        PriorityQueue<Integer> q=new PriorityQueue<>(1,(a,b)->a-b);
        String sum1="",sum2="";
        int count=0;
        
        for(int i=0;i<n;i++)
            q.add(arr[i]);
        
        while(!q.isEmpty())
        {
            if(q.peek()==0)
            {
                q.remove();
                continue;
            }
            
            if(++count%2==0)
                sum1+=q.remove();
            else 
                sum2+=q.remove();
            
        }
        
        return findSum(sum1,sum2);
        
    }
    
    String findSum(String s1, String s2)
    {
        String str="";
        int carry=0;
        
        char str1[]=s1.toCharArray();
        char str2[]=s2.toCharArray();
        
        int i=str1.length-1 , j=str2.length-1;
        
        while(i>=0 || j>=0 || carry==1)
        {
            int t1=0,t2=0;
            
            if(i>=0)
                t1=Character.getNumericValue(str1[i--]);
            
            if(j>=0)
                t2=Character.getNumericValue(str2[j--]);
                
            int sum=t1+t2+carry;
            carry=0;

            if(sum>9)
            {
                sum=sum%10;
                carry=1;
            }
            
            str=sum+str;    
        }
        
        return str;
    }
}


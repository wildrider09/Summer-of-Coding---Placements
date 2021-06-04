class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        // code here
        HashMap<Integer,String> map1=new HashMap<>();
        HashMap<Integer,String> map2=new HashMap<>();
        
        if(A.length!=B.length)
            return 0;
       
        for(int i=0;i<A.length;i+=2)
        {
            if(map1.get(A[i])==null)
                map1.put(A[i],A[i+1]+"#");
            else
                map1.put(A[i],map1.get(A[i])+A[i+1]+"#");
                
            if(map2.get(B[i])==null)
                map2.put(B[i],B[i+1]+"#");
            else
                map2.put(B[i],map2.get(B[i])+B[i+1]+"#");
        }
        
        for(Map.Entry<Integer,String> entry : map1.entrySet())
        {
            int t=entry.getKey();
            String s1=entry.getValue();
            String[] ss1 = s1.split("#");
            
            if(map2.containsKey(t))
            {
               String s2=map2.get(t);
            
                String ss2[]=s2.split("#");
               
               int i=0,j=ss2.length-1;
               
               while(i<ss1.length && j>=0)
                {
                    if(ss1[i].equals(ss2[j]))
                    { i++;j--;}
                    
                    else
                        break;
                }
            
                if(i==ss1.length && j==-1)
                    continue;
                else
                    return 0;
                
            }
            
            else    return 0;
        }
        
        return 1;
    }
};

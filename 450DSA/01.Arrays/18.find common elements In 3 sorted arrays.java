class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<>();
        
        list=merge(A,B,n1,n2,list);
        
        int temp[]=list.stream().mapToInt(Integer::intValue).toArray();
        list=new ArrayList<>();
        
        return merge(temp,C,temp.length,n3,list);
    }
    
    ArrayList<Integer> merge(int a[],int b[],int n1,int n2,ArrayList<Integer> list)
    {
        int i=0,j=0;
        
        while(i<n1 && j<n2)
        {
            if(i>0 && a[i]==a[i-1]){
                i++; 
                continue;
            }
            
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            
            if(a[i]==b[j]){
                list.add(a[i]);
                i++;j++;
            }
            
            else if(a[i]>b[j])
                j++;
            
            else
                i++;
        }
        
        return list;
    }
}

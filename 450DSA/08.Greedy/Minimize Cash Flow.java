public class Solution {
    
    	public static class Compare implements Comparator<int[]>{
            public int compare(int[] a,int[] b){
                if(a[0]>b[0]){
                    return 1;
                }
                else if(a[0]<b[0])
                    return -1;
                else{
                    return a[1]-b[1];
                }
            }
        }
    	public static class Comparemax implements Comparator<int[]>{
            public int compare(int[] a,int[] b){
                if(a[0]>b[0]){
                    return -1;
                }
                else if(a[0]<b[0])
                    return 1;
                else{
                    return a[1]-b[1];
                }
            }
        }
       public static int[][] minCashFlow(int[][] transaction, int n) {
            // Write your code here
            int arr[]=new int[n];
            PriorityQueue<int[]> pq1=new PriorityQueue<>(1,new Compare());
            PriorityQueue<int[]> pq2=new PriorityQueue<>(1,new Comparemax());
                
            for(int i=0;i<n;i++){
                for(int j = 0; j < n; j++) 
				{
					arr[i] += (transaction[j][i] - transaction[i][j]);
				}
            }
               
           int count=0;
            for(int i=0;i<n;i++){
                int[] p=new int[]{arr[i],i};
                if(arr[i]<0)
                   pq1.add(p); 
           
                else if(arr[i]>0)
                	pq2.add(p);
                	
               if(arr[i]==0){
                   count++;
               }
            }
            
            for(int i=0;i<n;i++)
            	Arrays.fill(transaction[i],0);
            
            while(count!=n){  n
          // arr[]={0,0,0,0};
                
                int[] min=pq1.poll();
                int[] max=pq2.poll();
//              System.out.println(min[0]+" "+max[0]);

                
                if(Math.abs(min[0])>Math.abs(max[0])){
                    	transaction[min[1]][max[1]]+=Math.abs(max[0]);
                    	min[0]=min[0]+max[0];
                        max[0]=0;
                	}        	
                else if(Math.abs(min[0])<Math.abs(max[0])){
                    	transaction[min[1]][max[1]]+=Math.abs(min[0]);
                        max[0]=min[0]+max[0];
                        min[0]=0;
                       
                	}
                else{
                    transaction[min[1]][max[1]]+=Math.abs(min[0]);
                    max[0]=0;
                    min[0]=0;
                    count++;
                }
                count++;
                
                if(max[0]>0)
	               	pq2.add(max);
                if(min[0]<0)
                    pq1.add(min);
   
            }
            return transaction;
        }
}

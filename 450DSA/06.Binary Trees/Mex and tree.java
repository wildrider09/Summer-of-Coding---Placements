import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        ArrayList<Integer> B=new ArrayList<>();
        ArrayList<ArrayList<Integer>> C=new ArrayList<>();
        
        for(int i=0;i<2;i++){
            C.add(new ArrayList<>());
        }
        
        B.add(3);B.add(0);B.add(0);
        
        C.get(0).add(1);C.get(0).add(2);
        C.get(1).add(1);C.get(1).add(3);
        // C.get(2).add(1);C.get(2).add(4);
        // C.get(3).add(4);C.get(3).add(5);
        // C.get(4).add(4);C.get(4).add(6);
        
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> pre=new ArrayList<>();
        int max=0;
        
        for(int i=0;i<B.size();i++)
            max=max>B.get(i)?max:B.get(i);
        
        
        for(int i=0;i<=max;i++)
            arr.add(new ArrayList<>());
        
        
        for(int i=0;i<C.size();i++){
            
            int index=C.get(i).get(0);
            int value=C.get(i).get(1);
            
            arr.get(B.get(index-1)).add(B.get(value-1));
        }
        
        for(int i=0;i<B.size();i++){
            int val=B.get(i);
            pre.add(new ArrayList<>());
            int index=pre.size()-1;
            
            Queue<Integer> q=new LinkedList<>();
            q.add(val);
            
            while(!q.isEmpty()){
                int v=q.poll();
                pre.get(index).add(v);
                
                for(int j=0;j<arr.get(v).size();j++){
                    q.add(arr.get(v).get(j));
                }
            }
        }
        
        for(int i=0;i<pre.size();i++){
            
            Collections.sort(pre.get(i));
        }
        
        for(int i=0;i<B.size();i++){
            int j=0;
            for(;j<pre.get(i).size();j++){
                
                if(pre.get(i).get(j)!=j){
                    ans.add(j);
                    break;
                }
            }
            if(j==pre.get(i).size())
                ans.add(j);
        }
        
        for(int i=0;i<ans.size();i++)
            System.out.print(ans.get(i)+" ");
    }
}

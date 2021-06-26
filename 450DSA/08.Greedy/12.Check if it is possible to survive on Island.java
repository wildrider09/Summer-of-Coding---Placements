class Solution{
    static int minimumDays(int S, int N, int M){
        // code here
            
        int sunday,food_req,food_given,days=S;
        
        sunday=S/7;
        days-=sunday;
        
        food_req=S*M;
        food_given=days*N;
        
        if(food_req>food_given)
            return -1;
        else
            return (int)Math.ceil(food_req*1.0/N);
        
    }
}

class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
            
        if(q.isEmpty())
            return null;
            
        int a=q.remove();
        rev(q);
        q.add(a);
        return q;

    }
}

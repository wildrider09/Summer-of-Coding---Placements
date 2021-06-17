class LRUCache
{
    static Deque<Integer> q;
    static HashMap<Integer,Integer> map;
    static int limit;
    
    LRUCache(int cap)
    {
        q=new ArrayDeque<>(cap);
        map=new HashMap<>(cap);
        limit=cap;
    }

    public static int get(int key)
    {
        if(map.containsKey(key))
        {
            q.remove(key);
            q.addLast(key);
            return map.get(key);
        }
        
        else
            return -1;
    }

    public static void set(int key, int value)
    {
        if(map.containsKey(key))
            q.remove(key);
        
        else if(map.size()==limit)
        {
            int t=q.removeFirst();
            map.remove(t);
        }
        
        map.put(key,value);
        q.addLast(key);
        
    }
}


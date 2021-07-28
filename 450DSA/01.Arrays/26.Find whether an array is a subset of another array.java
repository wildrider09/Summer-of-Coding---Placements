class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashSet<Long> set=new HashSet<>();
        
        for(int i=0;i<(int)n;i++)
            set.add(a1[i]);
        
        for(int i=0;i<(int)m;i++)
        {
            if(set.contains(a2[i]))
                continue;
            else
                return "No";
        }
        
        return "Yes";
    }
}

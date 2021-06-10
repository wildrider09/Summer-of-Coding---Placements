class Solution {  public List<String> restoreIpAddresses(String s) {
        List<String> validIPs = new ArrayList<>();
        int n = s.length();
        
        for (int i=1; i < n && i < 4 ; i++) 
            {
                String s1 = s.substring(0,i);
                if(!isValidIPInt(s1))
                    continue;
                
                for (int j=1; i+j < n && j < 4 ; j++) {
                    String s2 = s.substring(i, j+i);
                    if(!isValidIPInt(s2))
                    continue;
                   
                for (int k=1; i+j+k < n && k < 4 ; k++) {
                    String s3 = s.substring(j+i, i+j+k);
                    String s4 = s.substring(i+j+k);
                    if( !isValidIPInt(s4) || !isValidIPInt(s3))
                        continue;
                    else
                        validIPs.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    
                }
            }
        }
            
        return validIPs;
    }

     boolean isValidIPInt(String str) {
        if (str.length() >3 )
             return false;
         if (str.charAt(0) == '0' && str.length() > 1)
             return false;
         if( Integer.valueOf(str) >= 0 && Integer.valueOf(str)<=255)
             return true;
         return false;
    }

}

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          long mod=(long)1e9+7;
          long n1=0,n2=0;
          while(l1!=null || l2!=null)
          {
              if(l1!=null)
              {
                n1=((n1*10)%mod+l1.data)%mod;
                l1=l1.next;
              }
              if(l2!=null)
              {
                  n2=((n2*10)%mod+l2.data)%mod;
                l2=l2.next;
              }
          }
          
          return (n1*n2)%mod;
   }
}

import java.util.*;
public class Solution {
    	static class Item
        {
            int data;
            int index;
            public Item(int a,int b)
            {
                this.data=a;
                this.index=b;
            }
        }

        public static int maxStock(int[] prices, int n, int amount ) {
        // Write your code here
            Item arr[]=new Item[n];
            int stock=0;
            
            for(int i=0;i<n;i++)
            {    
                arr[i]= new Item(prices[i],i+1); 
            }
            Arrays.sort(arr,(a,b)->a.data-b.data);
            
            for(int i=0;i<n;i++)
            {
           		while(amount>=arr[i].data && arr[i].index-->0)
                {
                    stock++;
                    amount-=arr[i].data;
				}
            }
        	return stock;
    }
}


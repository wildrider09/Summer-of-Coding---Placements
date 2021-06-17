class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
	Arrays.sort(dep);
	int  i=0,j=0,count=0,maxpltf=0;
	while(i < n && j < n) 
        {
            if(arr[i] <= dep[j]) 
            {
                count++;
                i++;
            }
            else
            {
                count--;
                j++;
            }
        
            maxpltf=Math.max(count,maxpltf);
        }
        return maxpltf;       
    }
    
}



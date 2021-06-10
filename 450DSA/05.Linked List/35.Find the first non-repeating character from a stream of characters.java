class Solution {
	public:
		string FirstNonRepeating(string A){
		    // Code here
	    string str ="";
            queue<char> q;
            int charcount[26] = {0};
            for(int i=0;i<A.length();i++)
            { 
                q.push(A[i]);
                charcount[A[i]-'a']++;
                while(!q.empty())
                {
                    if(charcount[q.front()-'a']>1)
                        q.pop();
                    else
                    {
                        str+= q.front();
                        break;
                    }
                    
                }
                if(q.empty())
                {
                    str+= '#';
                }   
            }
            
            return str;

		}

};

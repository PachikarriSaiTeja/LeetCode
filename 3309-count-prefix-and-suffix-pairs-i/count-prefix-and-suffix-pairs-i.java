class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int cnt=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                
                if(i>j && words[i].startsWith(words[j]) &&words[i].endsWith(words[j]))
                {
                    
             cnt+=1;

                }

            }
        }
        return cnt;
    }
}
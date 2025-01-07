class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
           int temp=0;
            for(int j=0;j<words.length;j++)
            {
                if(i!=j && words[j].contains(words[i]))
                {
                       temp=1;
                }

            }
            if(temp==1)
            {
                li.add(words[i]);
            }
        }
        return li;
        
    }
}
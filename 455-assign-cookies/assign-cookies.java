class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt = 0;
        int j = 0;
        if(s.length * g.length == 0) return cnt;
        for(int i = 0 ; i < s.length; i++)
        {
            if(j>=g.length) return cnt;
            if(s[i]>=g[j])
            {
                j++;
                cnt++;
            }
        

        }
        return cnt;
    }
}
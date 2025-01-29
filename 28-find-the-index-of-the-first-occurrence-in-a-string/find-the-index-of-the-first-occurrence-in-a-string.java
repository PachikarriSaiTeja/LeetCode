class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i=0;i<n-m+1;i++)
        {
            int temp=0;
            for(int j=0;j<m;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    temp=1;
                    break;
                }
            }
            if(temp==0) return i;
        }
        return -1;
    }
}
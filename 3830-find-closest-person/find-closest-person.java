class Solution {
    public int findClosest(int x, int y, int z) {
        int ans = 0;
        int a = Math.abs(z-y);
        int b = Math.abs(z-x);
        if(a>b)
        {
            ans = 1;
        }
        else if(a<b)
        {
            ans = 2;
        }

return ans;
        
    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
        double k = Math.log(n)/Math.log(2);
        return  (n & (n-1)) == 0 && n>0;
    }
}
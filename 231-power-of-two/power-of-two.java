class Solution {
    public boolean isPowerOfTwo(int n) {
        double k = Math.log(n)/Math.log(2);
        return Math.abs(k-Math.round(k)) < 1e-10;
    }
}
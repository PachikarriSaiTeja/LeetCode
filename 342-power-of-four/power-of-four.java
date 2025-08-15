class Solution {
    public boolean isPowerOfFour(int n) {
        double x = 1e-10;
        double k = (Math.log(n)/Math.log(4));
        return Math.abs(k-Math.round(k)) < x;
    }
}
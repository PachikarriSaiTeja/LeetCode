class Solution {
    public long coloredCells(int n) {
        return recur(n);
    }
    public long recur(int n){
        if(n==1)
        {
            return 1;
        }
    
        return recur(n-1)+4*(n-1);
    
    }
}


class Solution {

    public int[] findDiagonalOrder(int[][] mat) {
    int val = 0;
    int ind = 0;
    int n = mat.length * mat[0].length;
    int[] ans = new int[n];
       while(val < n)
       {
        if(val % 2 == 0){
             for(int i = mat.length-1; i>-1; i--)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(i+j == val)
                {
                  ans[ind] = mat[i][j];
                  ind++;

                }


            }
            
        }
        }
        else{
             for(int i = 0; i< mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(i+j == val)
                {
                  ans[ind] = mat[i][j];
                  ind++;

                }


            }
            
        }
        }
        val++;
       }
        return ans;
    }
}
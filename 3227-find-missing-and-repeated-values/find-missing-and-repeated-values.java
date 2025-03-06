class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int val=m*n;
        int[] arr=new int[val+1];
        int[] ans=new int[2];
        int o=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[grid[i][j]]++;
            }
        }
        for(int i=1;i<=val;i++){

                if(arr[i]==0 && i!=0)
                {
                    ans[1]=i;
                    o+=1;
                    
                }
                if(arr[i]==2 && i!=0)
                {
                    ans[0]=i;
                    o+=1;

                }
            if(o==2)
            {
                return ans;
            }
        }

         return ans;
    }
}
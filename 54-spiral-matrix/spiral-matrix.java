class Solution {
    List<Integer> visited = new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int row = matrix.length;
        int column = matrix[0].length;
        int t = 0, l = 0;
        int r = column-1, b = row-1;
        

        while(visited.size()!=column*row)
        {


            addRow(matrix,t,l,r,1);
            t++;
            if(visited.size()==column*row) return visited;

            addCol(matrix,r,t,b,1);
            r--;

            if(visited.size()==column*row) return visited;

            addRow(matrix,b,r,l,-1);
            b--;

            if(visited.size()==column*row) return visited;

            addCol(matrix,l,b,t,-1);
            l++;

            if(visited.size()==column*row) return visited;
            
          
        }
        return visited;
        
    }
    public void addRow(int[][] matrix, int r, int s, int e, int m)
    {
        if(m==1)
        {
            for(int i=s;i<=e;i++)
        {
            visited.add(matrix[r][i]);
        }

        }
        else
        {
           for(int i=s;i>=e;i--)
           {
                    visited.add(matrix[r][i]);
           }
        }
    }
    public void addCol(int[][] matrix, int c, int s, int e ,int m)
    {
        if(m==1)
        {
            
         for(int i=s;i<=e;i++)
        {
            visited.add(matrix[i][c]);
        }
        
        }
        else{
            for(int i=s;i>=e;i--)
            {
                visited.add(matrix[i][c]);
            }
        }
    }

}
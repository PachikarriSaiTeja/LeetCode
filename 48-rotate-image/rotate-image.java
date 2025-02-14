class Solution {
    public void rotate(int[][] matrix) {
        
       int r=matrix.length;
       int[][] arr=new int[r][r];
    
        
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
    arr[i][j]=matrix[i][j];

}
}
// System.out.printl


for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
	matrix[i][j]=arr[j][r-i-1];


}
}        
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
    arr[i][j]=matrix[i][j];

}
}
// System.out.printl


for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
	matrix[i][j]=arr[j][r-i-1];


}
}        
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
    arr[i][j]=matrix[i][j];

}
}
// System.out.printl


for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{
	matrix[i][j]=arr[j][r-i-1];


}
}


    }
}

        // 00,01,02,03     03,1,3,23,33
        // 10,11,12,13     02,12,22,32
        // 20,21,22,23     01,11,21,31
        // 30,31,32,33     00,10,20,30
         
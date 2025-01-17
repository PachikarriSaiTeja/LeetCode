class Solution {
    public int numRookCaptures(char[][] board) {
        int r=0;
        int c=0;
        int cnt=0;
       for(int i=0;i<8;i++)
       {
        for(int j=i;j<8;j++)
        {
                if(board[i][j]=='R')
                {
                    r=i;
                    c=j;
                    break;
                }
        }

       }
       int ind=0;
       int pawn=0;
       for(int i=c;i>-1;i--)
       {

            if(board[r][i]!='.' && board[r][i]=='p' && board[r][i]!='R')
            {
                cnt+=1;
                break;
            }
            else if(board[r][i]!='.' && board[r][i]!='p'&& board[r][i]!='R')
            {
                break;
            }

       }
        for(int i=c;i<8;i++)
       {

            if(board[r][i]!='.' && board[r][i]=='p' && board[r][i]!='R')
            {
                cnt+=1;
                break;
            }
            else if(board[r][i]!='.' && board[r][i]!='p' && board[r][i]!='R')
            {
                break;
            }

       }


       for(int i=r;i>-1;i--)
       {

            if(board[i][c]!='.' && board[i][c]=='p' && board[i][c]!='R')
            {
                cnt+=1;
                break;
            }
            else if(board[i][c]!='.' && board[i][c]!='p'&& board[i][c]!='R')
            {
                break;
            }

       }
        for(int i=r;i<8;i++)
       {

            if(board[i][c]!='.' && board[i][c]=='p' && board[i][c]!='R')
            {
                cnt+=1;
                break;
            }
            else if(board[i][c]!='.' && board[i][c]!='p' && board[i][c]!='R')
            {
                break;
            }

       }
       return cnt;
        


}
}
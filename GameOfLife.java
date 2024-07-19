class Solution {
    int dirx[] = new int[]{0, 0, 1, -1, 1, 1, -1, -1};
    int diry[] = new int[]{1, -1, 0, 0, -1, 1, 1, -1};
    int getCnt(int[][] board, int i, int j){
        int ans =0;
        for(int k=0;k<8;k++){
            int x = dirx[k]+i;
            int y = diry[k]+j;
            if(x>=0 && y>=0 && x<board.length && y<board[0].length){
                ans+=board[x][y]%10;
            }
        }
        return ans;

    }
    public void gameOfLife(int[][] board) {

        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int cnt = getCnt(board, i, j);
                if(board[i][j]==0 && cnt==3)board[i][j]+=10;
                else if(board[i][j]==1){
                    if(cnt<2)board[i][j] += 20;
                    else if(cnt>3)board[i][j] += 20;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int move = board[i][j]/10;
                board[i][j]%=10;
                if(move==1)board[i][j]+=1;
                else if(move==2) board[i][j]-=1;
            }
        }
    }
}
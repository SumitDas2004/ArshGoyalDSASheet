class Solution {
    int dirx[] = new int[]{0, 0, 1, -1};
    int diry[] = new int[]{1, -1, 0, 0};
    public boolean isPresent(char board[][], int i, int j, int ind, String word, boolean visited[][]){
        if(ind>=word.length())return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j])return false;
        if(board[i][j]!=word.charAt(ind))return false;
        visited[i][j] = true;
        for(int e=0;e<4;e++){
            int x = dirx[e]+i;
            int y = diry[e]+j;
            if(isPresent(board, x, y, ind+1, word, visited))return true;
        }
        visited[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(isPresent(board, i, j, 0, word, new boolean[board.length][board[0].length]))
                return true;
            }
        }
        return false;
    }
}
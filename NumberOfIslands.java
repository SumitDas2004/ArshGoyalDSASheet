class Solution {
    int dirx[] = new int[]{1, -1, 0, 0};
    int diry[] = new int[]{0, 0, 1, -1};
    public void dfs(char grid[][], boolean visited[][], int i, int j){
        visited[i][j]= true;
        for(int k=0;k<4;k++){
            int x= dirx[k]+i;
            int y = diry[k]+j;
            if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && !visited[x][y] && grid[x][y]=='1')
                dfs(grid, visited, x, y);
        }
    }
    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    ans++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return ans;
    }
}
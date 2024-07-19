class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int u = 0;
        int d = matrix.length - 1;
        int r = matrix[0].length - 1;
        int l = 0;
        while (l <= r && u <= d) {
            if (l <= r) {
                for (int i = l; i <= r; i++) {
                    ans.add(matrix[u][i]);
                }
            }
            u++;
            if(u>d)break;
            if (u <= d) {
                for (int i = u; i <= d; i++) {
                    ans.add(matrix[i][r]);
                }
            }
            r--;
            if(l>r)break;
            if (l <= r) {
                for (int i = r; i >= l; i--) {
                    ans.add(matrix[d][i]);
                }
            }
            d--;
            if(u>d)break;
            if (u <= d) {
                for (int i = d; i >= u; i--) {
                    ans.add(matrix[i][l]);
                }
            }
            l++;
            if(l>r)break;
        }
        return ans;
    }
}
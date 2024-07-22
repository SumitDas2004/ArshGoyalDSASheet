class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]+=1000;
                matrix[i][j]*=10000;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]+=(matrix[j][i]/10000);
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]%=10000;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length-j-1;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = tmp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]-=1000;
            }
        }
    }
}
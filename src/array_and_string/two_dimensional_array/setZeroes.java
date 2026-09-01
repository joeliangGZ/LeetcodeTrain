package array_and_string.two_dimensional_array;

public class setZeroes {

        public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(matrix[i][j] == 0){
                    row[i] = col[j] = true;
                }
            }
        }

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // 输入：
    // [
    //   [0,1,2,0], 0
    //   [3,4,5,2],
    //   [1,3,1,5]
    //    0     0
    // ]
    // 输出：
    // [
    //   [0,0,0,0], 0 0 0 0
    //   [0,4,5,0],
    //   [0,3,1,0]
    //    000   000
    // ]
    
}

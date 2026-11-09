package basic_algorithms;

public class rotateMatrix {

    public void rotate(int[][] matrix) {

        int n = matrix.length;
        int[][] new_matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <n; j++) {
                new_matrix[j][n-i-1] = matrix[i][j];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <n; j++) {
                matrix[i][j] = new_matrix[i][j];
            }
        }

    }

    // 2  i 1  j 0  -> i 0 j 2(4-1-1)
    // 4  i 1  j 1  -> i 1 j 2(4-1-1)
    // 3  i 2  j 1  -> i 1 j 1(4-1-2) 
    
}

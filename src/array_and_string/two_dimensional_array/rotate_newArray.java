package array_and_string.two_dimensional_array;

public class rotate_newArray {

    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        
        int[][] rotated = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                rotated[j][n-1-i] = matrix[i][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = rotated[i][j];
            }
        }
        
    }

    // 对于矩阵中的第一行而言，在旋转后，它出现在倒数第一列的位置：
    // 并且，第一行的第 x 个元素在旋转后恰好是倒数第一列的第 x 个元素。

    // 对于矩阵中的第二行而言，在旋转后，它出现在倒数第二列的位置：

    // 对于矩阵中的第三行和第四行同理。这样我们可以得到规律：
    // 对于矩阵中第 i 行的第 j 个元素，在旋转后，它出现在倒数第 i 列的第 j 个位置。

    // 我们将其翻译成代码。由于矩阵中的行列从 0 开始计数，因此对于矩阵中的元素 matrix[row][col]，在旋转后，它的新位置为 matrix_new[col][n−row−1]。


}


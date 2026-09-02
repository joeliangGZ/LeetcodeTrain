package array_and_string.two_dimensional_array;

public class findDiagonalOrder {
    
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        
        int[] res = new int[m*n];

        int r = 0, c = 0, dir = 1;
        
        for (int i = 0; i < m * n; i++) {
            
            res[i] = mat[r][c];
            
            if(dir == 1) { // 右上
                if(c == n-1) { // 触及右边界，提前判断，防止c++越界（if r == 0 先判断）
                    r++;
                    dir = -1;
                } else if (r == 0) { // 触及上边界
                    c++;
                    dir = -1;
                } else {  // 正常往右上 
                    r--;
                    c++;
                }
            } else { // 左下
                if (r == m -1) { // 触及下边界，提前判断，防止 r++ 越界（if c==0 先判断）
                    c++;
                    dir = 1;
                } else if (c == 0) { // 触及左边界 
                    r++;
                    dir = 1;
                } else { // 正常往左下
                    r++;
                    c--;
                }
            }
        }
        
        return res;
    }
}

package basic_algorithms;

public class isValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        
        // rows[i][num]: 第 i 行中数字 num (0-8 映射 1-9) 是否已经出现过
        boolean[][] rows = new boolean[9][9];
        // cols[j][num]: 第 j 列中数字 num 是否已经出现过
        boolean[][] cols = new boolean[9][9];
        // boxes[k][num]: 第 k 个 3x3 宫格中数字 num 是否已经出现过
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                
                // 跳过未填入的空格
                if (val == '.') {
                    continue;
                }

                // 将字符 '1'-'9' 转换为索引 0-8
                int num = val - '1';
                
                // 计算当前坐标所属的 3x3 宫格编号
                int boxIndex = (r / 3) * 3 + (c / 3);

                // 检查行、列、宫格中是否已有相同数字
                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false; // 存在冲突，数独无效
                }

                // 标记该数字在行、列、宫格中已出现
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
    
}

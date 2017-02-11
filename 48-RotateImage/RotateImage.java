public class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        if (length == 0) {
            return;
        }
        int tmp;
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[length - 1 - j][i];
                matrix[length - 1 - j][i] = matrix[length - 1 - i][length - 1 - j];
                matrix[length - 1 - i][length - 1 - j] = matrix[j][length - 1 - i];
                matrix[j][length - 1 - i] = tmp;
            }
        }
        return;
    }
}

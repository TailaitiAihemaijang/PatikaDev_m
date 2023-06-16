package Arry;

/**
 * ClassName: _07_Partik
 * Package: Arry
 * Description:
 *
 * @Author Musteqqim
 * @Create 6/16/2023 7:21 AM
 * @Version 1.0
 */
public class _07_Partik {
    public static void main(String[] args) {
        int[][] matrix= {
                {4,7,9},
                {1,5,8}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeMatrix = new int[cols][rows];
        for (int i = 0;i < rows;i++){
            for (int j = 0;j < cols;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(transposeMatrix);
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] transposeMatrix){
        for (int i = 0;i < transposeMatrix.length;i++){
            for (int j = 0;j < transposeMatrix[i].length;j++){
                System.out.print(transposeMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

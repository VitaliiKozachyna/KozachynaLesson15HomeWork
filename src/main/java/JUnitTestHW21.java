import java.util.Arrays;

public class JUnitTestHW21 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int[][] matrix1 = new int[5][5];
        showMatrix(matrix1);
        System.out.println(matrix.isSquareMatrix(matrix1));

        int[][] matrix2 = new int[5][6];
        showMatrix(matrix2);
        System.out.println(matrix.isSquareMatrix(matrix2));

        int[][] matrix3 = new int[][]{{1,2,3,4,5}, {1,2,3,4}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
        showMatrix(matrix3);
        System.out.println(matrix.isSquareMatrix(matrix3));

        int[][] matrix4 = null;

        System.out.println(matrix.isSquareMatrix(matrix4));
    }

    public static void showMatrix(int[][] matrix){
        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}

public class Matrix {

    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        for (int[] i : matrix) {
            if (matrix.length != i.length) {
                return false;
            }
        }
        return true;
    }

    public double getAverageCountArray(int[] array){
        double average = 0;
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        average = (double) sum / array.length;
        return average;
    }
}
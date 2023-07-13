import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    int[][] matrix1 = new int[5][5];
    int[][] matrix2 = new int[5][6];
    int[][] matrix3 = new int[][]{{1,2,3,4,5}, {1,2,3,4}, {1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};
    int[] array = new int[]{2, 2, 4, 4, 6, 6};
    @BeforeEach
    void setUp() {
    }

    @Test
    void isSquareMatrix() {
        assertTrue(Matrix.isSquareMatrix(matrix1));
        assertFalse(Matrix.isSquareMatrix(matrix2));
        assertFalse(Matrix.isSquareMatrix(matrix3));
    }

    @Test
    void getAverageCountArray() {
        assertEquals(4, Matrix.getAverageCountArray(array));
    }
}
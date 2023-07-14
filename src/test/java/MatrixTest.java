import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    Matrix matrix = new Matrix();
    int[][] matrix1;
    int[][] matrix2;
    int[][] matrix3;
    int[][] matrix4;
    int[] array;

    @BeforeEach
    void setUp() {
        matrix1 = new int[5][5];
        matrix2 = new int[5][6];
        matrix3 = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        matrix4 = null;
        array = new int[]{2, 2, 4, 4, 6, 6};
    }

    @AfterEach
    void cleanUp() {
        matrix1 = null;
        matrix2 = null;
        matrix3 = null;
        matrix4 = null;
        array = null;
    }

    @Test
    void isSquareMatrix() {
        assertTrue(matrix.isSquareMatrix(matrix1));
    }

    @Test
    void isRectMatrix() {
        assertFalse(matrix.isSquareMatrix(matrix2));
    }

    @Test
    void isNotSquareMatrix() {
        assertFalse(matrix.isSquareMatrix(matrix3));
    }

    @Test
    void isNull() {
        assertFalse(matrix.isSquareMatrix(matrix4));
    }

    @Test
    void getAverageCountArray() {
        assertEquals(4, matrix.getAverageCountArray(array));
    }
}
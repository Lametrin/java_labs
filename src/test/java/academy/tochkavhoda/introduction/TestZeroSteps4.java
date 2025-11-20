package academy.tochkavhoda.introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestZeroSteps4 {
    private static final double DOUBLE_EPS = 1E-6;

    @Test
    public void testMax() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{5, 1, 22}, {3, -2}};
        assertEquals(22, zeroSteps4.max(matrix1));
        int[][] matrix2 = {{-5, -1}, {-22}, {-3, -2}};
        assertEquals(-1, zeroSteps4.max(matrix2));
        int[][] matrix3 = {};
        assertEquals(Integer.MIN_VALUE, zeroSteps4.max(matrix3));
    }

    @Test
    public void testMin() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{5, 1, 22}, {3, -2}};
        assertEquals(-2, zeroSteps4.min(matrix1));
        int[][] matrix2 = {{-5, -1}, {-22}, {-3, -2}};
        assertEquals(-22, zeroSteps4.min(matrix2));
        int[][] matrix3 = {};
        assertEquals(Integer.MAX_VALUE, zeroSteps4.min(matrix3));
    }

    @Test
    public void testFindValue() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{1, 2}, {3}, {0, 8}};
        assertTrue(zeroSteps4.find(matrix, 2));
        assertTrue(zeroSteps4.find(matrix, 0));
        assertFalse(zeroSteps4.find(matrix, 10));
    }

    @Test
    public void testAllRowsSortedDescendant() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{3, 2, 1}, {5, 4, 3}, {8, 7, 6}};
        assertTrue(zeroSteps4.isSortedDescendant(matrix1));
        int[][] matrix2 = {{3, 2, 2}, {5, 4, 3}, {8, 7, 6}};
        assertFalse(zeroSteps4.isSortedDescendant(matrix2));
        int[][] matrix3 = {{3, 2, 1}};
        assertTrue(zeroSteps4.isSortedDescendant(matrix3));
        int[][] matrix4 = {{}};
        assertTrue(zeroSteps4.isSortedDescendant(matrix4));
        int[][] matrix5 = {{5, 4, 3, 2, 1}, {12, 5, 4, 3}, {34, 12, 10, 9, 8, 7, 6}};
        assertTrue(zeroSteps4.isSortedDescendant(matrix5));
    }

    @Test
    public void testHasNoZeroRows() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{3, 2, 0}, {5, 4, 3}, {8, 0, 6}};
        assertEquals(1, zeroSteps4.hasNoZeroRows(matrix1));
        int[][] matrix2 = {{3, 2, 2}, {5, 4, 3}, {8, 7, 6}};
        assertEquals(3, zeroSteps4.hasNoZeroRows(matrix2));
        int[][] matrix3 = {{3, 2, 1}, {}};
        assertEquals(2, zeroSteps4.hasNoZeroRows(matrix3));
    }

    @Test
    public void testHasFullZeroRows() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{3, 2, 0}, {5, 4, 3}, {8, 0, 6}};
        assertFalse(zeroSteps4.hasFullZeroRow(matrix1));
        int[][] matrix2 = {{3, 2, 2}, {0, 0, 0}, {8, 7, 6}};
        assertTrue(zeroSteps4.hasFullZeroRow(matrix2));
        int[][] matrix3 = {{3, 2, 1}, {}};
        assertFalse(zeroSteps4.hasFullZeroRow(matrix3));
        int[][] matrix4 = {{}, {}};
        assertFalse(zeroSteps4.hasFullZeroRow(matrix4));
    }

    @Test
    public void testIsSymmetric() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{3, 2, 0}, {5, 4, 3}, {8, 0, 6}};
        assertFalse(zeroSteps4.isSymmetric(matrix1));
        int[][] matrix2 = {{3, 2, 4}, {2, 0, 5}, {4, 5, 6}};
        assertTrue(zeroSteps4.isSymmetric(matrix2));
        int[][] matrix3 = {{3}};
        assertTrue(zeroSteps4.isSymmetric(matrix3));
    }

    @Test
    public void testMainDiagonalMax() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        assertEquals(8, zeroSteps4.mainDiagonalMax(matrix1));
        int[][] matrix2 = {{100, 2, 3}, {3, 4, 5}, {6, 7, 800}};
        assertEquals(800, zeroSteps4.mainDiagonalMax(matrix2));
        int[][] matrix3 = {{}};
        assertEquals(Integer.MIN_VALUE, zeroSteps4.mainDiagonalMax(matrix3));
        int[][] matrix4 = {{-1, -2, 3}, {3, -4, 5}, {6, -7, -8}};
        assertEquals(-1, zeroSteps4.mainDiagonalMax(matrix4));
    }

    @Test
    public void testMainDiagonalPositivesSum() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        assertEquals(13, zeroSteps4.mainDiagonalPositivesSum(matrix1));
        int[][] matrix2 = {{100, 2, 3}, {3, -4, 5}, {6, 7, -8}};
        assertEquals(100, zeroSteps4.mainDiagonalPositivesSum(matrix2));
        int[][] matrix3 = {{}};
        assertEquals(0, zeroSteps4.mainDiagonalPositivesSum(matrix3));
        int[][] matrix4 = {{-1, -2, 3}, {3, -4, 5}, {6, -7, -8}};
        assertEquals(0, zeroSteps4.mainDiagonalPositivesSum(matrix4));
    }

    @Test
    public void testSecondaryDiagonalMax() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        assertEquals(6, zeroSteps4.secondaryDiagonalMax(matrix1));
        int[][] matrix2 = {{100, 2, 3}, {3, 4, 5}, {-6, 7, 800}};
        assertEquals(4, zeroSteps4.secondaryDiagonalMax(matrix2));
        int[][] matrix3 = {{}};
        assertEquals(Integer.MIN_VALUE, zeroSteps4.secondaryDiagonalMax(matrix3));
        int[][] matrix4 = {{-1, -2, 3}, {3, -4, 5}, {-6, -7, -8}};
        assertEquals(3, zeroSteps4.secondaryDiagonalMax(matrix4));
    }

    @Test
    public void testSecondaryDiagonalPositivesSum() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        assertEquals(13, zeroSteps4.secondaryDiagonalPositivesSum(matrix1));
        int[][] matrix2 = {{100, 2, 3}, {3, -4, 5}, {6, 7, -8}};
        assertEquals(9, zeroSteps4.secondaryDiagonalPositivesSum(matrix2));
        int[][] matrix3 = {{}};
        assertEquals(0, zeroSteps4.secondaryDiagonalPositivesSum(matrix3));
        int[][] matrix4 = {{-1, -2, -3}, {3, -4, 5}, {-6, -7, -8}};
        assertEquals(0, zeroSteps4.secondaryDiagonalPositivesSum(matrix4));
    }

    @Test
    public void testSum() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix1 = {{1, 2, 3}, {3, 4}, {6, 7, 8}, {9, 10, 11, 12}, {}};
        int[][] matrix2 = {{100, 2, 3}, {3, -5}, {6, 7, -8}, {0, 2, 5, -3}, {}};
        int[][] result = {{101, 4, 6}, {6, -1}, {12, 14, 0}, {9, 12, 16, 9}, {}};
        int[][] sum = zeroSteps4.matrixSum(matrix1, matrix2);
        for (int i = 0; i < sum.length; i++) {
            assertArrayEquals(result[i], sum[i]);
        }
    }

    @Test
    public void testTranspose() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        zeroSteps4.transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(result[i], matrix[i]);
        }
    }

    @Test
    public void testInterchange() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{1, 2, 3}, {4, 6}, {7, 8, 9}, {}};
        int[][] result = {{4, 6}, {1, 2, 3}, {}, {7, 8, 9}};
        zeroSteps4.interchange(matrix);
        for (int i = 0; i < matrix.length; i++) {
            assertArrayEquals(result[i], matrix[i]);
        }
    }

    @Test
    public void testToLinearByRow() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{10}, {1, 12, 3}, {4, 26}, {}, {7, 8, 49},};
        int[] result = {10, 1, 12, 3, 4, 26, 7, 8, 49};
        int[] scan = zeroSteps4.toLinearByRow(matrix);
        assertArrayEquals(result, scan);
    }

    @Test
    public void testToLinearByColumn() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{1, 12, 3}, {4, 26, 17}, {7, 8, 49},};
        int[] result = {1, 4, 7, 12, 26, 8, 3, 17,49};
        int[] scan = zeroSteps4.toLinearByColumn(matrix);
        assertArrayEquals(result, scan);
    }

    @Test
    public void testToLinearByRowUpperTriangle() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{1, 12, 3}, {4, 26, 17}, {7, 8, 49},};
        int[] result = {1, 12,3, 26, 17, 49 };
        int[] scan = zeroSteps4.toLinearByRowUpperTriangle(matrix);
        assertArrayEquals(result, scan);
    }

    @Test
    public void testSumUntilNotFoundInRow() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{7}, {1, 12, 3}, {}, {4, 3, 17}, {7, 8, 9},};
        assertEquals(48,zeroSteps4.sumUntilNotFoundInRow(matrix, 3));
        assertEquals(62,zeroSteps4.sumUntilNotFoundInRow(matrix, 9));
        assertEquals(71,zeroSteps4.sumUntilNotFoundInRow(matrix, 100));
    }

    @Test
    public void testSumUntilNotFound() {
        ZeroSteps4 zeroSteps4 = new ZeroSteps4();
        int[][] matrix = {{7}, {1, 12, 3}, {}, {4, 26, 17}, {7, 8, 9},};
        assertEquals(94,zeroSteps4.sumUntilNotFound(matrix, 100));
        assertEquals(8,zeroSteps4.sumUntilNotFound(matrix, 12));
        assertEquals(23,zeroSteps4.sumUntilNotFound(matrix, 4));
    }
}

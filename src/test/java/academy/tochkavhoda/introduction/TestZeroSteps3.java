package academy.tochkavhoda.introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestZeroSteps3 {
    private static final double DOUBLE_EPS = 1E-6;

    @Test
    public void testSum() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3};
        assertEquals(6, zeroSteps3.sum(array1));
        int[] array2 = {-1, -2, 3};
        assertEquals(0, zeroSteps3.sum(array2));
        int[] array3 = {};
        assertEquals(0, zeroSteps3.sum(array3));
    }

    @Test
    public void testMul() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3};
        assertEquals(6, zeroSteps3.mul(array1));
        int[] array2 = {-1, -2, 3};
        assertEquals(6, zeroSteps3.mul(array2));
        int[] array3 = {1, 2, 0};
        assertEquals(0, zeroSteps3.mul(array3));
        int[] array4 = {};
        assertEquals(0, zeroSteps3.mul(array4));
    }

    @Test
    public void testMin() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {5, 1, 2, 3, -2};
        assertEquals(-2, zeroSteps3.min(array1));
        int[] array2 = {-5, -1, -22, -3, -2};
        assertEquals(-22, zeroSteps3.min(array2));
        int[] array3 = {};
        assertEquals(Integer.MAX_VALUE, zeroSteps3.min(array3));
    }

    @Test
    public void testMax() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {5, 1, 22, 3, -2};
        assertEquals(22, zeroSteps3.max(array1));
        int[] array2 = {-5, -1, -22, -3, -2};
        assertEquals(-1, zeroSteps3.max(array2));
        int[] array3 = {};
        assertEquals(Integer.MIN_VALUE, zeroSteps3.max(array3));
    }

    @Test
    public void testAverage() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3, 4};
        assertEquals(2.5, zeroSteps3.average(array1), DOUBLE_EPS);
        int[] array2 = {};
        assertEquals(0, zeroSteps3.average(array2), DOUBLE_EPS);
    }

    @Test
    public void testSortedDescendant() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {3, 2, 1};
        assertTrue(zeroSteps3.isSortedDescendant(array1));
        int[] array2 = {3, 2, 2};
        assertFalse(zeroSteps3.isSortedDescendant(array2));
        int[] array3 = {3, 2, 1, 4};
        assertFalse(zeroSteps3.isSortedDescendant(array3));
        int[] array4 = {1};
        assertTrue(zeroSteps3.isSortedDescendant(array4));
        int[] array5 = {};
        assertTrue(zeroSteps3.isSortedDescendant(array5));
    }

    @Test
    public void testCube() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3, 0};
        zeroSteps3.cube(array1);
        int[] arrayResult1 = {1, 8, 27, 0};
        assertArrayEquals(arrayResult1, array1);
        int[] array2 = {100, 200, 3, 10};
        zeroSteps3.cube(array2);
        int[] arrayResult2 = {1000000, 8000000, 27, 1000};
        assertArrayEquals(arrayResult2, array2);
    }

    @Test
    public void testFindValue() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array = {1, 2, 3, 0};
        assertTrue(zeroSteps3.find(array, 2));
        assertTrue(zeroSteps3.find(array, 0));
        assertFalse(zeroSteps3.find(array, 10));
    }

    @Test
    public void testReverse() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3, 0};
        int[] arrayResult1 = {0, 3, 2, 1};
        zeroSteps3.reverse(array1);
        assertArrayEquals(arrayResult1, array1);
        int[] array2 = {1, 2, 6, 3, 0};
        int[] arrayResult2 = {0, 3, 6, 2, 1};
        zeroSteps3.reverse(array2);
        assertArrayEquals(arrayResult2, array2);
        int[] array3 = {1};
        int[] arrayResult3 = {1};
        zeroSteps3.reverse(array3);
        assertArrayEquals(arrayResult3, array3);
        int[] array4 = {};
        int[] arrayResult4 = {};
        zeroSteps3.reverse(array4);
        assertArrayEquals(arrayResult4, array4);
    }

    @Test
    public void testIsPalindrome() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 2, 1};
        assertTrue(zeroSteps3.isPalindrome(array1));
        int[] array2 = {1, 2, 6, 2, 1};
        assertTrue(zeroSteps3.isPalindrome(array2));
        int[] array3 = {1, 2, 6, 3, 1};
        assertFalse(zeroSteps3.isPalindrome(array3));
        int[] array4 = {1};
        assertTrue(zeroSteps3.isPalindrome(array4));
        int[] array5 = {};
        assertTrue(zeroSteps3.isPalindrome(array5));
    }

    @Test
    public void testReplaceBySquare() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3, 0};
        int[] arrayResult1 = {1, 4, 9, 0};
        zeroSteps3.replaceBySquare(array1);
        assertArrayEquals(arrayResult1, array1);
        int[] array2 = {1, 2, 0, 3, 0};
        int[] arrayResult2 = {1, 4, 0, 3, 0};
        zeroSteps3.replaceBySquare(array2);
        assertArrayEquals(arrayResult2, array2);
        int[] array3 = {1, 2, 3};
        int[] arrayResult3 = {1, 4, 9};
        zeroSteps3.replaceBySquare(array3);
        assertArrayEquals(arrayResult3, array3);
        int[] array4 = {0, 2, 3};
        int[] arrayResult4 = {0, 2, 3};
        zeroSteps3.replaceBySquare(array4);
        assertArrayEquals(arrayResult4, array4);
        int[] array5 = {};
        int[] arrayResult5 = {};
        zeroSteps3.replaceBySquare(array5);
        assertArrayEquals(arrayResult5, array5);

    }

    @Test
    public void testMulNonZero() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3};
        assertEquals(6, zeroSteps3.mulNonZero(array1));
        int[] array2 = {-1, -2, 3};
        assertEquals(6, zeroSteps3.mulNonZero(array2));
        int[] array3 = {1, 2, 0};
        assertEquals(2, zeroSteps3.mulNonZero(array3));
        int[] array4 = {0, 2, 3};
        assertEquals(6, zeroSteps3.mulNonZero(array4));
        int[] array5 = {};
        assertEquals(0, zeroSteps3.mulNonZero(array5));
    }

    @Test
    public void testAllPositive() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3};
        assertTrue(zeroSteps3.allPositive(array1));
        int[] array2 = {-1, -2, 3};
        assertFalse(zeroSteps3.allPositive(array2));
        int[] array3 = {1, 2, 0};
        assertFalse(zeroSteps3.allPositive(array3));
        int[] array4 = {0, 2, 3};
        assertFalse(zeroSteps3.allPositive(array4));
        int[] array5 = {};
        assertFalse(zeroSteps3.allPositive(array5));
    }

    @Test
    public void testAllEqual() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3};
        assertFalse(zeroSteps3.allEqual(array1));
        int[] array2 = {-1, -1, -1};
        assertTrue(zeroSteps3.allEqual(array2));
        int[] array3 = {1, 1, 1, 1, 2};
        assertFalse(zeroSteps3.allEqual(array3));
        int[] array4 = {};
        assertTrue(zeroSteps3.allEqual(array4));
    }

    @Test
    public void testGreaterThanNeighbours() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3};
        assertEquals(-1, zeroSteps3.greaterThanNeighbours(array1));
        int[] array2 = {-1, 3, -1, 5};
        assertEquals(1, zeroSteps3.greaterThanNeighbours(array2));
        int[] array3 = {1, 2};
        assertEquals(-1, zeroSteps3.greaterThanNeighbours(array3));
        int[] array4 = {};
        assertEquals(-1, zeroSteps3.greaterThanNeighbours(array4));
    }

    @Test
    public void testNeighboursAverage() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        double[] array1 = {1, 2, 3};
        assertTrue(zeroSteps3.neighboursAverage(array1));
        double[] array2 = {1, 2, 4};
        assertFalse(zeroSteps3.neighboursAverage(array2));
        double[] array3 = {1, 2};
        assertFalse(zeroSteps3.neighboursAverage(array3));
    }

    @Test
    public void testSumBetween2Zeros() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 0, 2, 3, 0, 5};
        assertEquals(5, zeroSteps3.sumBetween2Zeros(array1));
        int[] array2 = {0, 2, 3, 10, 0, 5};
        assertEquals(15, zeroSteps3.sumBetween2Zeros(array2));
        int[] array3 = {1, 0, 0, 3, 10, 0, 5};
        assertEquals(0, zeroSteps3.sumBetween2Zeros(array3));
    }

    @Test
    public void testSameAtPosition() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array11 = {1, 2, 3};
        int[] array12 = {1, 2, 3};
        assertEquals(3, zeroSteps3.sameAtPosition(array11, array12));
        int[] array21 = {1, 2, 3, 4, 5};
        int[] array22 = {1, 2, 3};
        assertEquals(3, zeroSteps3.sameAtPosition(array21, array22));
        int[] array31 = {1, 2, 3, 4, 5};
        int[] array32 = {6, 7, 8};
        assertEquals(0, zeroSteps3.sameAtPosition(array31, array32));
        int[] array41 = {1, 2, 3, 4, 5};
        int[] array42 = {0, 9, 3};
        assertEquals(1, zeroSteps3.sameAtPosition(array41, array42));
        int[] array51 = {1, 2, 3, 4, 5};
        int[] array52 = {};
        assertEquals(0, zeroSteps3.sameAtPosition(array51, array52));
        int[] array61 = {};
        int[] array62 = {};
        assertEquals(0, zeroSteps3.sameAtPosition(array61, array62));
    }

    @Test
    public void testBothZeroAtPosition() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array11 = {1, 2, 3};
        int[] array12 = {1, 2, 3};
        assertFalse(zeroSteps3.bothZeroAtPosition(array11, array12));
        int[] array21 = {1, 0, 3, 4, 5};
        int[] array22 = {1, 0, 3};
        assertTrue(zeroSteps3.bothZeroAtPosition(array21, array22));
        int[] array31 = {1, 2, 3, 0, 5};
        int[] array32 = {6, 7, 8};
        assertFalse(zeroSteps3.bothZeroAtPosition(array31, array32));
        int[] array41 = {0, 2, 3, 4, 5};
        int[] array42 = {0};
        assertTrue(zeroSteps3.bothZeroAtPosition(array41, array42));
        int[] array51 = {1, 2, 3, 4, 5};
        int[] array52 = {};
        assertFalse(zeroSteps3.bothZeroAtPosition(array51, array52));
        int[] array61 = {};
        int[] array62 = {};
        assertFalse(zeroSteps3.bothZeroAtPosition(array61, array62));
    }

    @Test
    public void testAccumulatedSum() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array1 = {1, 2, 3, 10, 20};
        int[] result1 = {1, 3, 6, 16, 36};
        zeroSteps3.accumulatedSum(array1);
        assertArrayEquals(result1, array1);
        int[] array2 = {4};
        int[] result2 = {4};
        zeroSteps3.accumulatedSum(array2);
        assertArrayEquals(result2, array2);
        int[] array3 = {};
        int[] result3 = {};
        zeroSteps3.accumulatedSum(array3);
        assertArrayEquals(result3, array3);
    }

    @Test
    public void testMerge() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] array11 = {1, 2, 3};
        int[] array12 = {4, 5, 6};
        int[] result1 = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(result1, zeroSteps3.mergeArrays(array11, array12));
        int[] array21 = {1, 4, 6};
        int[] array22 = {2, 3, 5};
        int[] result2 = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(result2, zeroSteps3.mergeArrays(array21, array22));
        int[] array31 = {1, 4, 6, 8, 12};
        int[] array32 = {2, 3, 5};
        int[] result3 = {1, 2, 3, 4, 5, 6, 8, 12};
        assertArrayEquals(result3, zeroSteps3.mergeArrays(array31, array32));
        int[] array41 = {1, 2, 3};
        int[] array42 = {1, 2, 3, 4, 5};
        int[] result4 = {1, 1, 2, 2, 3, 3, 4, 5};
        assertArrayEquals(result4, zeroSteps3.mergeArrays(array41, array42));
    }

    @Test
    public void testInsideCircle() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        int[] x = {0, 10, 0, 5, 8, 12};
        int[] y = {0, 0, 10, 5, 8, 0};
        assertEquals(4, zeroSteps3.insideCircle(x, y, 10));
    }

    @Test
    public void testScalarProduct() {
        ZeroSteps3 zeroSteps3 = new ZeroSteps3();
        double[] array11 = {0, 10, 0, 5, 8, 12};
        double[] array21 = {0, 0, 10, 5, 8, 0};
        assertEquals(89, zeroSteps3.scalarProduct(array11, array21));
        double[] array12 = {};
        double[] array22 = {};
        assertEquals(0, zeroSteps3.scalarProduct(array12, array22));
    }

}


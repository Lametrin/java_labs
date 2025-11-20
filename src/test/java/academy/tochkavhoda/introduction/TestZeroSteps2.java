package academy.tochkavhoda.introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestZeroSteps2 {

    private static final double DOUBLE_EPS = 1E-6;

    @Test
    public void testSumSquares() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumSquares(1));
        assertEquals(55, zeroSteps2.sumSquares((5)));
        assertEquals(338350, zeroSteps2.sumSquares(100));
    }

    @Test
    public void testSumOdds() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumOdds(1));
        assertEquals(9, zeroSteps2.sumOdds(5));
        assertEquals(9, zeroSteps2.sumOdds(6));
        assertEquals(2500, zeroSteps2.sumOdds(100));
    }

    @Test
    public void testSumInverses() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumInverses(1), DOUBLE_EPS);
        assertEquals(2.28333333, zeroSteps2.sumInverses(5), DOUBLE_EPS);
        assertEquals(5.18737751, zeroSteps2.sumInverses(100), DOUBLE_EPS);
    }

    @Test
    public void testFactorial() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1L, zeroSteps2.factorial(1));
        assertEquals(120L, zeroSteps2.factorial(5));
        assertEquals(2432902008176640000L, zeroSteps2.factorial(20));
    }

    @Test
    public void testProdDigits() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.prodDigits(1));
        assertEquals(6, zeroSteps2.prodDigits(123));
        assertEquals(480, zeroSteps2.prodDigits(58341));
    }

    @Test
    public void testFibonacci() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(0, zeroSteps2.fibonacci(0));
        assertEquals(1, zeroSteps2.fibonacci(1));
        assertEquals(1, zeroSteps2.fibonacci(2));
        assertEquals(55, zeroSteps2.fibonacci(10));
    }

    @Test
    public void testSum2Powers() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1L, zeroSteps2.sum2Powers(0));
        assertEquals(3L, zeroSteps2.sum2Powers(1));
        assertEquals(2097151L, zeroSteps2.sum2Powers(20));
        assertEquals(2199023255551L, zeroSteps2.sum2Powers(40));
    }

    @Test
    public void testSumSquaresWithBarrier() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumSquaresWithBarrier(1, 1));
        assertEquals(55, zeroSteps2.sumSquaresWithBarrier(5, 56));
        assertEquals(30, zeroSteps2.sumSquaresWithBarrier(5, 28));
        assertEquals(338350, zeroSteps2.sumSquaresWithBarrier(100, 338350));
        assertEquals(102510, zeroSteps2.sumSquaresWithBarrier(100, 100000));
    }

    @Test
    public void testPairProd() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumPairProd(1, 1));
        assertEquals(9, zeroSteps2.sumPairProd(2, 2));
        assertEquals(18, zeroSteps2.sumPairProd(2, 3));
        assertEquals(6438750, zeroSteps2.sumPairProd(50, 100));
    }

    @Test
    public void testPairProdWithBarrier1() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumPairProdWithBarrier(1, 1, 2));
        assertEquals(0, zeroSteps2.sumPairProdWithBarrier(1, 1, 1));
        assertEquals(9, zeroSteps2.sumPairProdWithBarrier(2, 2, 5));
        assertEquals(5, zeroSteps2.sumPairProdWithBarrier(2, 2, 4));
    }

    @Test
    public void testSumInversePairProd() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumInversePairProd(1, 1), DOUBLE_EPS);
        assertEquals(2.25, zeroSteps2.sumInversePairProd(2, 2), DOUBLE_EPS);
        assertEquals(2.75, zeroSteps2.sumInversePairProd(2, 3), DOUBLE_EPS);
        assertEquals(23.339076, zeroSteps2.sumInversePairProd(50, 100), DOUBLE_EPS);
    }

    @Test
    public void testTripleProd() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(1, zeroSteps2.sumTripleProd(1, 1, 1));
        assertEquals(27, zeroSteps2.sumTripleProd(2, 2, 2));
        assertEquals(180, zeroSteps2.sumTripleProd(2, 3, 4));
        assertEquals(569856120, zeroSteps2.sumTripleProd(50, 100, 200));
    }

    @Test
    public void testCalculateE() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(2.718281828, zeroSteps2.calculateE(), DOUBLE_EPS);
    }

    @Test
    public void testCalculatePi() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(3.14159265, zeroSteps2.calculatePi(), DOUBLE_EPS);
    }

    @Test
    public void testCalculateCircleSquare() {
        ZeroSteps2 zeroSteps2 = new ZeroSteps2();
        assertEquals(0.78, zeroSteps2.calculateCircleSquare(1, 10000000), 0.01);
        assertEquals(3.15, zeroSteps2.calculateCircleSquare(2, 10000000), 0.01);
    }

}

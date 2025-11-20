package academy.tochkavhoda.introduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestZeroSteps1 {

    private static final double DOUBLE_EPS = 1E-6;

    @Test
    public void testSum() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(4, zeroSteps1.sum(2, 2));
        assertEquals(20000, zeroSteps1.sum(10000, 10000));
    }

    @Test
    public void testMul() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(4, zeroSteps1.mul(2, 2));
        assertEquals(100000000, zeroSteps1.mul(10000, 10000));
    }

    @Test
    public void testDiv() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(1, zeroSteps1.div(2, 2));
        assertEquals(0, zeroSteps1.div(1, 2));
        assertEquals(1, zeroSteps1.div(10200, 10000));
    }

    @Test
    public void testMod() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(1, zeroSteps1.mod(3, 2));
        assertEquals(0, zeroSteps1.mod(4, 2));
        assertEquals(10, zeroSteps1.mod(70, 20));
    }

    @Test
    public void testEquals() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertTrue(zeroSteps1.isEqual(2, 2));
        assertFalse(zeroSteps1.isEqual(3, 2));
    }

    @Test
    public void testGreater() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertTrue(zeroSteps1.isGreater(3, 2));
        assertFalse(zeroSteps1.isGreater(2, 2));
        assertFalse(zeroSteps1.isGreater(1, 2));
    }

    @Test
    public void testCalculateTriangleSquare() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(6, zeroSteps1.calculateTriangleSquare(3, 4), DOUBLE_EPS);
        assertEquals(7.5, zeroSteps1.calculateTriangleSquare(3, 5), DOUBLE_EPS);
    }

    @Test
    public void testCalculateTrianglePerimeter() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(12, zeroSteps1.calculateTrianglePerimeter(3, 4), DOUBLE_EPS);
        assertEquals(13.830952, zeroSteps1.calculateTrianglePerimeter(3, 5), DOUBLE_EPS);
    }

    @Test
    public void testReverseNumber() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(123, zeroSteps1.reverseNumber(321));
        assertEquals(456, zeroSteps1.reverseNumber(654));
    }

    @Test
    public void testCalculate15Degree() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(32768, zeroSteps1.calculate15Degree(2));
        assertEquals(1, zeroSteps1.calculate15Degree(1));
        assertEquals(1000000000000000L, zeroSteps1.calculate15Degree(10));
    }

    @Test
    public void testIsInsideRect() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertTrue(zeroSteps1.isInsideRect(0, 0, 100, 100, 50, 50));
        assertTrue(zeroSteps1.isInsideRect(0, 0, 100, 100, 50, 100));
        assertTrue(zeroSteps1.isInsideRect(0, 0, 100, 100, 100, 100));
        assertTrue(zeroSteps1.isInsideRect(0, 0, 100, 100, 0, 0));
        assertFalse(zeroSteps1.isInsideRect(0, 0, 100, 100, 200, 200));
        assertFalse(zeroSteps1.isInsideRect(0, 0, 100, 100, 0, 101));
        assertFalse(zeroSteps1.isInsideRect(0, 0, 100, 100, 101, 0));
        assertFalse(zeroSteps1.isInsideRect(0, 0, 100, 100, -1, 0));
        assertFalse(zeroSteps1.isInsideRect(0, 0, 100, 100, 0, -1));
    }


    @Test
    public void testSqrtAbs() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(100, zeroSteps1.sqrtAbs(10000));
        assertEquals(100, zeroSteps1.sqrtAbs(-10000));
        assertEquals(0, zeroSteps1.sqrtAbs(0));
    }

    @Test
    public void testIsTriangleExist() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertTrue(zeroSteps1.isTriangleExist(3, 4, 5));
        assertTrue(zeroSteps1.isTriangleExist(3, 4, 6));
        assertFalse(zeroSteps1.isTriangleExist(3, 4, 10));
        assertFalse(zeroSteps1.isTriangleExist(3, 10, 5));
        assertFalse(zeroSteps1.isTriangleExist(10, 4, 5));
    }

    @Test
    public void testGetDigitsProduction() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(1, zeroSteps1.getDigitsProduction(1111));
        assertEquals(24, zeroSteps1.getDigitsProduction(1234));
        assertEquals(0, zeroSteps1.getDigitsProduction(1024));
    }

    @Test
    public void testIsCircleInsideSquare() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertFalse(zeroSteps1.isCircleInsideSquare(2, 4));
        assertTrue(zeroSteps1.isCircleInsideSquare(2, 5));
        assertFalse(zeroSteps1.isCircleInsideSquare(4, 2));
    }

    @Test
    public void testGetCharByCode() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals('A', zeroSteps1.getCharByCode((short)65));
        assertEquals('А', zeroSteps1.getCharByCode((short)1040));
        assertEquals('1', zeroSteps1.getCharByCode((short)49));
        assertEquals('\t', zeroSteps1.getCharByCode((short)9));
        assertEquals('\\', zeroSteps1.getCharByCode((short)92));
        assertEquals('®', zeroSteps1.getCharByCode((short)0x00AE));
    }

    @Test
    public void testCodeByChar() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals(65, zeroSteps1.getCodeByChar('A'));
        assertEquals(1040, zeroSteps1.getCodeByChar('А'));
        assertEquals(49, zeroSteps1.getCodeByChar('1'));
        assertEquals(9, zeroSteps1.getCodeByChar('\t'));
        assertEquals(92, zeroSteps1.getCodeByChar('\\'));
        assertEquals(0x00AE, zeroSteps1.getCodeByChar('®'));
    }

    @Test
    public void testGetCharByOffset() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals('d', zeroSteps1.getCharByCodeAndOffset('a', (short) 3));
        assertEquals('я', zeroSteps1.getCharByCodeAndOffset('ы', (short) 4));
        assertEquals('9', zeroSteps1.getCharByCodeAndOffset('0', (short) 9));
    }

    @Test
    public void testIsEqualOrGreater() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertTrue(zeroSteps1.isGreaterOrEqual('d', 'd'));
        assertTrue(zeroSteps1.isGreaterOrEqual('x', 'a'));
        assertTrue(zeroSteps1.isGreaterOrEqual('а', 'b'));
    }

    @Test
    public void testGetAverageChar() {
        ZeroSteps1 zeroSteps1 = new ZeroSteps1();
        assertEquals('b', zeroSteps1.getAverageChar('a', 'c'));
        assertEquals('m', zeroSteps1.getAverageChar('a', 'z'));
        assertEquals('п', zeroSteps1.getAverageChar('а', 'я'));
    }
}
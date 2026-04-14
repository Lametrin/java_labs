package academy.tochkavhoda.introduction;

public class ZeroSteps1 {

    public int sum(int x, int y) {
        return x + y; }
    public int mul(int x, int y) {
        return x * y; }
    public int div(int x, int y) {
        return x / y; }
    public int mod(int x, int y) {
        return x % y; }
    public boolean isEqual(int x, int y) {
        return x == y; }
    public boolean isGreater(int x, int y) {
        return x > y; }
    public double calculateTriangleSquare(int side1, int side2) {
        return 0.5 * side1 * side2; }
    public double calculateTrianglePerimeter(int side1, int side2) {
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        return side1 + side2 + hypotenuse;
    }
    public int reverseNumber(int number) {
        int a = number / 100;
        int b = (number / 10) % 10;
        int c = number % 10;
        return c * 100 + b * 10 + a;
    }
    public long calculate15Degree(int number) {
        long a2 = (long) number * number;
        long a4 = a2 * a2;
        long a8 = a4 * a4;
        long a12 = a8 * a4;
        return a12 * a2 * number;
    }
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }
    public double sqrtAbs(int number) { return Math.sqrt(Math.abs(number)); }
    public boolean isTriangleExist(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public int getDigitsProduction(int number) {
        number = Math.abs(number);
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;
        return d1 * d2 * d3 * d4;
    }
    public boolean isCircleInsideSquare(int radius, int side) {
        return 2 * radius < side;
    }
    public char getCharByCode(short code) {
        return (char) code; }
    public short getCodeByChar(char ch) {
        return (short) ch; }
    public char getCharByCodeAndOffset(char ch, short offset) {
        return (char) (ch + offset); }
    public boolean isGreaterOrEqual(char ch1, char ch2) {
        return ch1 >= ch2; }
    public char getAverageChar(char ch1, char ch2) {
        return (char) ((ch1 + ch2) / 2); }
}
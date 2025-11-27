package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Square {

    // поля строго private
    private Point topLeft;
    private int size;

    // 1. Square(Point leftTop, int size)
    public Square(Point leftTop, int size) {
        this.topLeft = new Point(leftTop.getX(), leftTop.getY());
        this.size = size;
    }

    // 2. Square(int xLeft, int yTop, int size)
    public Square(int xLeft, int yTop, int size) {
        this.topLeft = new Point(xLeft, yTop);
        this.size = size;
    }

    // 3. Square(int size)
    // левый нижний угол — в начале координат (0,0)
    // значит topLeft = (0, -size)
    public Square(int size) {
        this.topLeft = new Point(0, -size);
        this.size = size;
    }

    // 4. Square() со стороной 1
    public Square() {
        this(1);
    }

    // 5. getTopLeft()
    public Point getTopLeft() {
        return new Point(topLeft.getX(), topLeft.getY());
    }

    // 6. getBottomRight()
    public Point getBottomRight() {
        return new Point(topLeft.getX() + size, topLeft.getY() + size);
    }

    // 7. setTopLeft(Point topLeft)
    public void setTopLeft(Point topLeft) {
        this.topLeft = new Point(topLeft.getX(), topLeft.getY());
    }

    // 8. getLength()
    public int getLength() {
        return size;
    }

    // 9. moveTo(int x, int y)
    public void moveTo(int x, int y) {
        this.topLeft.moveTo(x, y);
    }

    // 10. moveTo(Point point)
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 11. moveRel(int dx, int dy)
    public void moveRel(int dx, int dy) {
        this.topLeft.moveRel(dx, dy);
    }

    // 12. resize(double ratio)
    public void resize(double ratio) {
        this.size = (int) (this.size * ratio);
    }

    // 13. getArea()
    public double getArea() {
        return (double) size * size;
    }

    // 14. getPerimeter()
    public double getPerimeter() {
        return size * 4.0;
    }

    // 15. isInside(int x, int y)
    public boolean isInside(int x, int y) {
        return x >= topLeft.getX()
                && x <= topLeft.getX() + size
                && y >= topLeft.getY()
                && y <= topLeft.getY() + size;
    }

    // 16. isInside(Point point)
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 17. isIntersects(Square square)
    public boolean isIntersects(Square square) {
        Point br = getBottomRight();
        Point oTL = square.getTopLeft();
        Point oBR = square.getBottomRight();

        boolean xOverlap = topLeft.getX() <= oBR.getX() && oTL.getX() <= br.getX();
        boolean yOverlap = topLeft.getY() <= oBR.getY() && oTL.getY() <= br.getY();
        return xOverlap && yOverlap;
    }

    // 18. isInside(Square square)
    public boolean isInside(Square square) {
        Point br = getBottomRight();
        Point oTL = square.getTopLeft();
        Point oBR = square.getBottomRight();

        return oTL.getX() >= topLeft.getX()
                && oBR.getX() <= br.getX()
                && oTL.getY() >= topLeft.getY()
                && oBR.getY() <= br.getY();
    }

    // 19. equals + hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;
        return size == square.size && Objects.equals(topLeft, square.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, size);
    }
}

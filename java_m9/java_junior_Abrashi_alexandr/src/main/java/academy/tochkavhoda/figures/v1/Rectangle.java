package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Rectangle {

    // поля строго private
    private Point topLeft;
    private Point bottomRight;

    // 1. Rectangle(Point leftTop, Point rightBottom)
    public Rectangle(Point leftTop, Point rightBottom) {
        this.topLeft = new Point(leftTop.getX(), leftTop.getY());
        this.bottomRight = new Point(rightBottom.getX(), rightBottom.getY());
    }

    // 2. Rectangle(int xLeft, int yTop, int xRight, int yBottom)
    public Rectangle(int xLeft, int yTop, int xRight, int yBottom) {
        this.topLeft = new Point(xLeft, yTop);
        this.bottomRight = new Point(xRight, yBottom);
    }

    // 3. Rectangle(int length, int width)
    // Создает Rectangle, левый нижний угол которого находится в начале координат.
    // В системе с Y направленной вниз левый верхний = (0, -width), правый нижний = (length, 0)
    public Rectangle(int length, int width) {
        this.topLeft = new Point(0, -width);
        this.bottomRight = new Point(length, 0);
    }

    // 4. Rectangle() размер (1,1), левый нижний угол в (0,0)
    public Rectangle() {
        this(1, 1);
    }

    // 5. getTopLeft()
    public Point getTopLeft() {
        return new Point(topLeft.getX(), topLeft.getY());
    }

    // 6. getBottomRight()
    public Point getBottomRight() {
        return new Point(bottomRight.getX(), bottomRight.getY());
    }

    // 7. setTopLeft(Point topLeft) — устанавливаем новую точку левого верхнего угла (не трогаем bottomRight)
    public void setTopLeft(Point topLeft) {
        this.topLeft = new Point(topLeft.getX(), topLeft.getY());
    }

    // 8. setBottomRight(Point bottomRight) — устанавливаем новую точку правого нижнего угла (не трогаем topLeft)
    public void setBottomRight(Point bottomRight) {
        this.bottomRight = new Point(bottomRight.getX(), bottomRight.getY());
    }

    // помощники: длина по X и ширина по Y
    // 9. getLength()
    public int getLength() {
        return bottomRight.getX() - topLeft.getX();
    }

    // 10. getWidth()
    public int getWidth() {
        return bottomRight.getY() - topLeft.getY();
    }

    // 11. moveTo(int x, int y) — передвигает Rectangle так, чтобы topLeft оказался в (x,y)
    public void moveTo(int x, int y) {
        int len = getLength();
        int wid = getWidth();
        this.topLeft.moveTo(x, y);
        this.bottomRight.moveTo(x + len, y + wid);
    }

    // 12. moveTo(Point point)
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 13. moveRel(int dx, int dy)
    public void moveRel(int dx, int dy) {
        this.topLeft.moveRel(dx, dy);
        this.bottomRight.moveRel(dx, dy);
    }

    // 14. resize(double ratio) — изменяет обе стороны в ratio раз, сохраняя topLeft
    // дробная часть отбрасывается
    public void resize(double ratio) {
        int newLength = (int) (getLength() * ratio);
        int newWidth = (int) (getWidth() * ratio);
        this.bottomRight.moveTo(this.topLeft.getX() + newLength, this.topLeft.getY() + newWidth);
    }

    // 15. stretch(double xRatio, double yRatio)
    public void stretch(double xRatio, double yRatio) {
        int newLength = (int) (getLength() * xRatio);
        int newWidth = (int) (getWidth() * yRatio);
        this.bottomRight.moveTo(this.topLeft.getX() + newLength, this.topLeft.getY() + newWidth);
    }

    // 16. getArea()
    public double getArea() {
        return (double) getLength() * getWidth();
    }

    // 17. getPerimeter()
    public double getPerimeter() {
        return 2.0 * (getLength() + getWidth());
    }

    // 18. isInside(int x, int y) — точка внутри или на границе
    public boolean isInside(int x, int y) {
        return x >= topLeft.getX() && x <= bottomRight.getX()
                && y >= topLeft.getY() && y <= bottomRight.getY();
    }

    // 19. isInside(Point point)
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 20. isIntersects(Rectangle rectangle)
    // Пересечение есть, если проекции по X и по Y пересекаются (включая касание)
    public boolean isIntersects(Rectangle rectangle) {
        boolean xOverlap = this.topLeft.getX() <= rectangle.bottomRight.getX()
                && rectangle.topLeft.getX() <= this.bottomRight.getX();
        boolean yOverlap = this.topLeft.getY() <= rectangle.bottomRight.getY()
                && rectangle.topLeft.getY() <= this.bottomRight.getY();
        return xOverlap && yOverlap;
    }

    // 21. isInside(Rectangle rectangle) — rectangle целиком внутри this (границы включительно)
    public boolean isInside(Rectangle rectangle) {
        return rectangle.topLeft.getX() >= this.topLeft.getX()
                && rectangle.bottomRight.getX() <= this.bottomRight.getX()
                && rectangle.topLeft.getY() >= this.topLeft.getY()
                && rectangle.bottomRight.getY() <= this.bottomRight.getY();
    }

    // 22. equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(topLeft, rectangle.topLeft) &&
                Objects.equals(bottomRight, rectangle.bottomRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, bottomRight);
    }
}

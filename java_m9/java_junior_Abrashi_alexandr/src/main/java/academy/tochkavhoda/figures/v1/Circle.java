package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Circle {

    private Point center;
    private int radius;

    // 1. Circle(Point center, int radius)
    public Circle(Point center, int radius) {
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }

    // 2. Circle(int xCenter, int yCenter, int radius)
    public Circle(int xCenter, int yCenter, int radius) {
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    // 3. Circle(int radius) центр (0,0)
    public Circle(int radius) {
        this.center = new Point(0, 0);
        this.radius = radius;
    }

    // 4. Circle() с радиусом 1
    public Circle() {
        this(1);
    }

    // 5. getCenter()
    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    // 6. getRadius()
    public int getRadius() {
        return radius;
    }

    // 7. setCenter(Point center)
    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    // 8. setRadius(int radius)
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // 9. moveTo(int x, int y)
    public void moveTo(int x, int y) {
        center.moveTo(x, y);
    }

    // 10. moveTo(Point point)
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 11. moveRel(int dx, int dy)
    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    // 12. resize(double ratio)
    public void resize(double ratio) {
        this.radius = (int) (this.radius * ratio);
    }

    // 13. getArea()
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // 14. getPerimeter()
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // 15. isInside(int x, int y)
    public boolean isInside(int x, int y) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }

    // 16. isInside(Point point)
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 17. equals + hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}

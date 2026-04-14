package academy.tochkavhoda.figures.v3;

import academy.tochkavhoda.iface.v3.Stretchable;

import java.util.Objects;

public class Circle extends Figure implements Stretchable {

    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }

    public Circle(int xCenter, int yCenter, int radius) {
        this.center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    public Circle(int radius) {
        this.center = new Point(0, 0);
        this.radius = radius;
    }

    public Circle() {
        this(1);
    }

    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void moveTo(int x, int y) {
        center.moveTo(x, y);
    }

    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        this.radius = (int) (this.radius * ratio);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isInside(int x, int y) {
        int dx = x - center.getX();
        int dy = y - center.getY();
        return dx * dx + dy * dy <= radius * radius;
    }

    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

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

    @Override
    public void stretch(double xRatio, double yRatio) {

    }
}

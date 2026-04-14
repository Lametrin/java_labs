package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class Ellipse {

    private Point center;
    private int xAxis; // полный размер по X
    private int yAxis; // полный размер по Y

    // 1. Ellipse(Point center, int xAxis, int yAxis)
    public Ellipse(Point center, int xAxis, int yAxis) {
        this.center = new Point(center.getX(), center.getY());
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    // 2. Ellipse(int xCenter, int yCenter, int xAxis, int yAxis)
    public Ellipse(int xCenter, int yCenter, int xAxis, int yAxis) {
        this.center = new Point(xCenter, yCenter);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    // 3. Ellipse(int xAxis, int yAxis) с центром (0,0)
    public Ellipse(int xAxis, int yAxis) {
        this(new Point(0, 0), xAxis, yAxis);
    }

    // 4. Ellipse() единичные оси, центр (0,0)
    public Ellipse() {
        this(1, 1);
    }

    // 5. getCenter()
    public Point getCenter() {
        return new Point(center.getX(), center.getY());
    }

    // 6. getXAxis()
    public int getXAxis() {
        return xAxis;
    }

    // 7. getYAxis()
    public int getYAxis() {
        return yAxis;
    }

    // 8. setXAxis(int xAxis)
    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    // 9. setYAxis(int yAxis)
    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    // 10. setCenter(Point center)
    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }

    // 11. moveTo(int x, int y)
    public void moveTo(int x, int y) {
        center.moveTo(x, y);
    }

    // 12. moveTo(Point point)
    public void moveTo(Point point) {
        moveTo(point.getX(), point.getY());
    }

    // 13. moveRel(int dx, int dy)
    public void moveRel(int dx, int dy) {
        center.moveRel(dx, dy);
    }

    // 14. resize(double ratio)
    public void resize(double ratio) {
        xAxis = (int) (xAxis * ratio);
        yAxis = (int) (yAxis * ratio);
    }

    // 15. stretch(double xRatio, double yRatio)
    public void stretch(double xRatio, double yRatio) {
        xAxis = (int) (xAxis * xRatio);
        yAxis = (int) (yAxis * yRatio);
    }

    // 16. getArea()
    public double getArea() {
        return Math.PI * (xAxis / 2.0) * (yAxis / 2.0);
    }

    // 17. getPerimeter() приближённо
    public double getPerimeter() {
        double a = xAxis / 2.0;
        double b = yAxis / 2.0;
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2.0);
    }

    // 18. isInside(int x, int y)
    public boolean isInside(int x, int y) {
        double dx = x - center.getX();
        double dy = y - center.getY();
        double halfX = xAxis / 2.0;
        double halfY = yAxis / 2.0;
        return (dx * dx) / (halfX * halfX) + (dy * dy) / (halfY * halfY) <= 1.0;
    }

    // 19. isInside(Point point)
    public boolean isInside(Point point) {
        return isInside(point.getX(), point.getY());
    }

    // 20. equals + hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ellipse)) return false;
        Ellipse ellipse = (Ellipse) o;
        return xAxis == ellipse.xAxis &&
                yAxis == ellipse.yAxis &&
                Objects.equals(center, ellipse.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, xAxis, yAxis);
    }
}

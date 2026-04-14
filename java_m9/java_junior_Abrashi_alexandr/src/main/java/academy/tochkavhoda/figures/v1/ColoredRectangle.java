package academy.tochkavhoda.figures.v1;

import java.util.Objects;

public class ColoredRectangle extends Rectangle {

    private int color;

    public ColoredRectangle(Point leftTop, Point rightBottom, int color) {
        super(leftTop, rightBottom);
        this.color = color;
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, int color) {
        super(xLeft, yTop, xRight, yBottom);
        this.color = color;
    }

    public ColoredRectangle(int length, int width, int color) {
        super(length, width);
        this.color = color;
    }

    public ColoredRectangle(int color) {
        super();
        this.color = color;
    }

    public ColoredRectangle() {
        super();
        this.color = 1;
    }

    public Point getTopLeft() {
        return super.getTopLeft();
    }

    public Point getBottomRight() {
        return super.getBottomRight();
    }

    public void setTopLeft(Point topLeft) {
        super.setTopLeft(topLeft);
    }

    public void setBottomRight(Point bottomRight) {
        super.setBottomRight(bottomRight);
    }

    public int getLength() {
        return super.getLength();
    }

    public int getWidth() {
        return super.getWidth();
    }

    public void moveTo(int x, int y) {
        super.moveTo(x, y);
    }

    public void moveTo(Point point) {
        super.moveTo(point);
    }

    public void moveRel(int dx, int dy) {
        super.moveRel(dx, dy);
    }

    public void resize(double ratio) {
        super.resize(ratio);
    }

    public void stretch(double xRatio, double yRatio) {
        super.stretch(xRatio, yRatio);
    }

    public double getArea() {
        return super.getArea();
    }

    public double getPerimeter() {
        return super.getPerimeter();
    }

    public boolean isInside(int x, int y) {
        return super.isInside(x, y);
    }

    public boolean isInside(Point point) {
        return super.isInside(point);
    }

    public boolean isIntersects(ColoredRectangle rectangle) {
        return super.isIntersects(rectangle);
    }

    public boolean isInside(ColoredRectangle rectangle) {
        return super.isInside(rectangle);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColoredRectangle that = (ColoredRectangle) o;
        return color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
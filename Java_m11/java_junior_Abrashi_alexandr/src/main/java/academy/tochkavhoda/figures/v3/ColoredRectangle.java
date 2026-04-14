package academy.tochkavhoda.figures.v3;

import academy.tochkavhoda.colors.v3.Color;
import academy.tochkavhoda.colors.v3.ColorErrorCode;
import academy.tochkavhoda.colors.v3.ColorException;

import java.util.Objects;

public class ColoredRectangle extends Rectangle {

    private Color color;

    public ColoredRectangle(Point leftTop, Point rightBottom, Color color) throws ColorException {
        super(leftTop, rightBottom);
        setColor(color);
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, Color color) throws ColorException {
        super(xLeft, yTop, xRight, yBottom);
        setColor(color);
    }

    public ColoredRectangle(int length, int width, Color color) throws ColorException {
        super(length, width);
        setColor(color);
    }

    public ColoredRectangle(Color color) throws ColorException {
        super();
        setColor(color);
    }

    public ColoredRectangle() throws ColorException {
        super();
        this.color = Color.RED;
    }

    public ColoredRectangle(Point leftTop, Point rightBottom, String color) throws ColorException {
        this(leftTop, rightBottom, Color.colorFromString(color));
    }

    public ColoredRectangle(int xLeft, int yTop, int xRight, int yBottom, String color) throws ColorException {
        this(xLeft, yTop, xRight, yBottom, Color.colorFromString(color));
    }

    public ColoredRectangle(int length, int width, String color) throws ColorException {
        this(length, width, Color.colorFromString(color));
    }

    public ColoredRectangle(String color) throws ColorException {
        this(Color.colorFromString(color));
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws ColorException {
        if (color == null) {
            throw new ColorException(ColorErrorCode.NULL_COLOR);
        }
        this.color = color;
    }

    public void setColor(String color) throws ColorException {
        this.color = Color.colorFromString(color);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColoredRectangle)) return false;
        ColoredRectangle other = (ColoredRectangle) o;
        return super.equals(o) && color == other.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
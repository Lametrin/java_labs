package academy.tochkavhoda.figures.v3;

import academy.tochkavhoda.colors.v3.Color;
import academy.tochkavhoda.colors.v3.ColorErrorCode;
import academy.tochkavhoda.colors.v3.ColorException;

import java.util.Objects;

public class ColoredCircle extends Circle {

    private Color color;

    public ColoredCircle(Point center, int radius, Color color) throws ColorException {
        super(center, radius);
        setColor(color);
    }

    public ColoredCircle(int x, int y, int radius, Color color) throws ColorException {
        super(x, y, radius);
        setColor(color);
    }

    public ColoredCircle(int radius, Color color) throws ColorException {
        super(radius);
        setColor(color);
    }

    public ColoredCircle(Color color) throws ColorException {
        super();
        setColor(color);
    }

    public ColoredCircle() throws ColorException {
        super();
        this.color = Color.RED;
    }

    public ColoredCircle(Point center, int radius, String color) throws ColorException {
        this(center, radius, Color.colorFromString(color));
    }

    public ColoredCircle(int x, int y, int radius, String color) throws ColorException {
        this(x, y, radius, Color.colorFromString(color));
    }

    public ColoredCircle(int radius, String color) throws ColorException {
        this(radius, Color.colorFromString(color));
    }

    public ColoredCircle(String color) throws ColorException {
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
        if (!(o instanceof ColoredCircle)) return false;
        ColoredCircle other = (ColoredCircle) o;
        return super.equals(o) && color == other.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
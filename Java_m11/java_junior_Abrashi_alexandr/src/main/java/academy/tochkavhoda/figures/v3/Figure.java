package academy.tochkavhoda.figures.v3;

import academy.tochkavhoda.iface.v3.HasArea;
import academy.tochkavhoda.iface.v3.Movable;

public abstract class Figure implements Movable, HasArea {

    public abstract double getPerimeter();

    public boolean isInside(Point p) {
        return isInside(p.getX(), p.getY());
    }

    public abstract boolean isInside(int x, int y);

    @Override
    public abstract void moveTo(int x, int y);

    @Override
    public abstract void moveRel(int dx, int dy);

    @Override
    public abstract void moveTo(Point point);
}
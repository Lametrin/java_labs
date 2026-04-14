package academy.tochkavhoda.iface.v3;

import academy.tochkavhoda.figures.v3.Point;

public interface Movable {
    void moveTo(int x, int y);
    void moveTo(Point point);

    void moveRel(int dx, int dy);
}

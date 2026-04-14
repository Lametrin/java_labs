package academy.tochkavhoda.iface.v2;

import academy.tochkavhoda.figures.v2.Point;

public interface Movable {
    void moveTo(int x, int y);
    void moveTo(Point point);

    void moveRel(int dx, int dy);
}

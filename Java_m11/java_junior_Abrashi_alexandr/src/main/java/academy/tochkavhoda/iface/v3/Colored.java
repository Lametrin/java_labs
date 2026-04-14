package academy.tochkavhoda.iface.v3;

import academy.tochkavhoda.colors.v3.Color;
import academy.tochkavhoda.colors.v3.ColorException;

public interface Colored {

    void setColor(Color color);

    Color getColor();

    void setColor(String colorString) throws ColorException;
}
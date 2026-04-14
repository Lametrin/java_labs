package academy.tochkavhoda.colors.v3;

public enum Color {
    RED,
    GREEN,
    BLUE;

    public static Color colorFromString(String colorString) throws ColorException {
        if (colorString == null) {
            throw new ColorException(ColorErrorCode.NULL_COLOR);
        }

        for (Color c : values()) {
            if (c.name().equals(colorString)) {
                return c;
            }
        }

        throw new ColorException(ColorErrorCode.WRONG_COLOR_STRING);
    }
}
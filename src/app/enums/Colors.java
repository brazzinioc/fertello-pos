package app.enums;

import app.utils.Constants;

public enum Colors {
    RED('R', Constants.RED),
    GREEN('V', Constants.GREEN),
    BLUE('A', Constants.BLUE),
    BLACK('N', Constants.BLACK),
    WHITE('B', Constants.WHITE);

    private final char code;
    private final String description;

    Colors(char code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Colors fromCode(char code) {
        for (Colors color : Colors.values()) {
            if (color.code == code) {
                return color;
            }
        }
        throw new IllegalArgumentException("Color no encontrado intente nuevamente: " + code);
    }

    public String getDescription() {
        return this.description;
    }
}
package app.enums;

import app.utils.Constants;

public enum Sizes {
    XLARGE('X', Constants.XLARGE),
    MEDIUM('M', Constants.MEDIUM),
    SMALL('S', Constants.SMALL),
    LARGE('L', Constants.LARGE);

    private final char code;
    private final String description;

    Sizes(char code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Sizes fromCode(char code) {
        for (Sizes size : Sizes.values()) {
            if (size.code == code) {
                return size;
            }
        }
        throw new IllegalArgumentException("Talla no encontrada intente nuevamente: " + code);
    }

    public String getDescription() {
        return this.description;
    }
}
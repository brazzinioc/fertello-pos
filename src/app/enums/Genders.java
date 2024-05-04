package app.enums;

import app.utils.Constants;

public enum Genders {
    MALE('M', Constants.MALE),
    FEMALE('F', Constants.FEMALE),
    UNISEX('U', Constants.UNISEX);

    private final char code;
    private final String description;

    Genders(char code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Genders fromCode(char code) {
        for (Genders gender : Genders.values()) {
            if (gender.code == code) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Genero no encontrado, intente nuevamente: " + code);
    }

    public String getDescription() {
        return this.description;
    }
}
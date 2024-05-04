package app.enums;

import app.utils.Constants;

public enum Roles {
    ADMIN('A', Constants.ADMIN_ROLE),
    PRODUCTION('O', Constants.PRODUCTION_ROLE),
    SALES('V', Constants.SALES_ROLE);

    private final char code;
    private final String description;

    Roles(char code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Roles fromCode(char code) {
        for (Roles role : Roles.values()) {
            if (role.code == code) {
                return role;
            }
        }
        throw new IllegalArgumentException("Rol invalido intente nuevamente: " + code);
    }

    public String getDescription() {
        return this.description;
    }
}
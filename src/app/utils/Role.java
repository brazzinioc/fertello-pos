package app.utils;

public enum Role {
    ADMIN('A', Constants.ADMIN_ROLE),
    PRODUCTION('O', Constants.PRODUCTION_ROLE),
    SALES('V', Constants.SALES_ROLE);

    private final char code;
    private final String description;

    Role(char code, String description) {
        this.code = code;
        this.description = description;
    }

    public static Role fromCode(char code) {
        for (Role role : Role.values()) {
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
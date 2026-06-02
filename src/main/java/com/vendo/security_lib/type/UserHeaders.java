package com.vendo.security_lib.type;

public enum UserHeaders {

    USER_ID("X-User-Id"),
    USER_EMAIL("X-User-Email"),
    STATUS("X-User-Status"),
    ROLES("X-Roles"),
    EMAIL_VERIFIED("X-Email-Verified");

    private final String header;

    UserHeaders(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }
}
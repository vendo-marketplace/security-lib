package com.vendo.security_lib.type;

public enum AuthHeader {

    ID("X-Id"),
    EMAIL("X-Email"),
    STATUS("X-Status"),
    ROLES("X-Roles"),
    EMAIL_VERIFIED("X-Email-Verified");

    private final String header;

    AuthHeader(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }
}
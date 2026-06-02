package com.vendo.security_lib.type;

public enum UserClaims {

    ID("id"),
    EMAIL("email"),
    VERIFIED("verified"),
    ROLES("roles"),
    STATUS("status");

    private final String claim;

    UserClaims(String claim) {
        this.claim = claim;
    }

    public String getClaim() {
        return claim;
    }

}

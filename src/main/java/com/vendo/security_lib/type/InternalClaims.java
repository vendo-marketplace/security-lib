package com.vendo.security_lib.type;

public enum InternalClaims {

    ROLES("roles");

    private final String claim;

    InternalClaims(String claim) {
        this.claim = claim;
    }

    public String getClaim() {
        return claim;
    }
}

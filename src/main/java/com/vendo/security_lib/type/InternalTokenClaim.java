package com.vendo.security_lib.type;

public enum InternalTokenClaim {

    ROLES("roles");

    private final String claim;

    InternalTokenClaim(String claim) {
        this.claim = claim;
    }

    public String getClaim() {
        return claim;
    }
}

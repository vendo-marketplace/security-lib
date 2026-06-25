package com.vendo.security_lib.type;

public enum TokenClaim {

    ID("id"),
    EMAIL("email"),
    VERIFIED("verified"),
    ROLES("roles"),
    STATUS("status");

    private final String claim;

    TokenClaim(String claim) {
        this.claim = claim;
    }

    public String getClaim() {
        return claim;
    }

}

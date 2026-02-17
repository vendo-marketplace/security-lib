package com.vendo.security_lib.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenClaim {

    ID("id"),
    VERIFIED("verified"),
    ROLES("roles"),
    STATUS("status");

    private final String claim;
}

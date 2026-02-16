package com.vendo.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TokenClaim {

    USER_ID_CLAIM("sub"),
    EMAIL_VERIFIED_CLAIM("email_verified"),
    ROLES_CLAIM("roles"),
    STATUS_CLAIM("status");

    private final String claim;
}

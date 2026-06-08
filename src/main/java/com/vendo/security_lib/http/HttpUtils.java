package com.vendo.security_lib.http;

public final class HttpUtils {
    private HttpUtils() {}

    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";

    public static String getTokenFrom(String authorization) {
        if (authorization == null || !authorization.startsWith(BEARER_PREFIX)) {
            throw new IllegalArgumentException("Invalid authorization.");
        }

        return authorization.substring(BEARER_PREFIX.length());
    }

}

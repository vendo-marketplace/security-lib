package com.vendo.security_lib.token;

import java.util.Map;
import java.util.Set;

public record TokenPayload(
        String subject,
        Map<String, Object> claims,
        Set<String> audience,
        long expiration) {

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String subject;
        private Map<String, Object> claims;
        private Set<String> audience;
        private long expiration;

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder claims(Map<String, Object> claims) {
            this.claims = claims;
            return this;
        }

        public Builder expiration(long expiration) {
            this.expiration = expiration;
            return this;
        }

        public Builder audience(Set<String> audience) {
            this.audience = audience;
            return this;
        }

        public TokenPayload build() {
            return new TokenPayload(subject, claims, audience, expiration);
        }
    }

}
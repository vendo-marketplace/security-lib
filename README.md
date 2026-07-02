# security-lib

## Overview
`security-lib` is a shared library for the Vendo ecosystem that provides common security-related building blocks used across microservices. It centralizes error response structures, HTTP utilities, and enums related to headers and token claims, ensuring consistent security handling throughout the platform.

## Features

* `ExceptionResponse` — a standardized structure for representing error responses across services
* HTTP utilities for common security-related operations (header extraction, request/response helpers)
* Enums for HTTP headers used in authentication and authorization flows
* Enums for token claims (e.g. id, email, roles) to ensure consistent claim naming across services
* Easy integration into any module of the Vendo ecosystem via a Maven dependency

## Installation
Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>io.github.vendo-marketplace-be</groupId>
    <artifactId>security-lib</artifactId>
    <version>latest-version</version>
    <packaging>jar</packaging>
</dependency>
```

## Usage
Once the dependency is added, the classes, utilities, and enums from `security-lib` become available for direct import in any module of the project.

Example:

```java
import com.vendo.security_lib.http.HttpUtils;
import com.vendo.security_lib.exception.ExceptionResponse;

// Example usage
String token = HttpUtils.getTokenFrom(authorization);

ExceptionResponse response = ExceptionResponse.builder()
        .message("Token is invalid or expired.")
        .path("/auth/sign-up")
        .code(401)
        .build();
```

## Requirements

* Java 17

## Notes
This library is intended solely for internal use within the Vendo ecosystem (`com.vendo`). It focuses exclusively on security-related cross-cutting concerns (error responses, HTTP helpers, header and claim enums) and should not contain service-specific business logic.
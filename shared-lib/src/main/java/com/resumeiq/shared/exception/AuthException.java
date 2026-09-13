package com.resumeiq.shared.exception;

public class AuthException extends AppException {
    public AuthException(String errorCode, String message) {
        super(errorCode, message);
    }

    public static AuthException invalidCredentials() {
        return new AuthException("AUTH_INVALID_CREDENTIALS", "Invalid email or password.");
    }

    public static AuthException tokenExpired() {
        return new AuthException("AUTH_TOKEN_EXPIRED", "Session expired, please log in again.");
    }

    public static AuthException emailAlreadyRegistered(String email) {
        return new AuthException("AUTH_EMAIL_EXISTS", "An account already exists for: " + email);
    }
}
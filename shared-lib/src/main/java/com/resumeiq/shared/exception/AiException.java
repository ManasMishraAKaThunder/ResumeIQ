package com.resumeiq.shared.exception;

public class AiException extends AppException {
    public AiException(String errorCode, String message) {
        super(errorCode, message);
    }

    public static AiException quotaExceeded() {
        return new AiException("AI_QUOTA_EXCEEDED", "Gemini API daily quota exceeded. Try again tomorrow.");
    }

    public static AiException upstreamFailure(Throwable cause) {
        AiException ex = new AiException("AI_UPSTREAM_FAILURE", "Gemini API request failed: " + cause.getMessage());
        return ex;
    }
}
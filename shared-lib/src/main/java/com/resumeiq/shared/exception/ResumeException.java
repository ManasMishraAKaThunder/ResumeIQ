package com.resumeiq.shared.exception;

public class ResumeException extends AppException {
    public ResumeException(String errorCode, String message) {
        super(errorCode, message);
    }

    public static ResumeException notFound(String id) {
        return new ResumeException("RESUME_NOT_FOUND", "Resume not found: " + id);
    }

    public static ResumeException unsupportedFormat(String fileName) {
        return new ResumeException("RESUME_UNSUPPORTED_FORMAT",
                "Unsupported file type: " + fileName + ". Only PDF and DOCX are accepted.");
    }
}
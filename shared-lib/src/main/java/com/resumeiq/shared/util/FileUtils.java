package com.resumeiq.shared.util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

public final class FileUtils {

    private static final Set<String> ALLOWED_MIME_TYPES = Set.of(
            "application/pdf",
            "application/vnd.openxmlformats-officedocument.wordprocessingml.document" // .docx
    );

    private FileUtils() {
    }

    /** Detects the real MIME type by reading file bytes, not trusting the client-sent extension. */
    public static String detectMimeType(Path filePath) {
        try {
            String probed = Files.probeContentType(filePath);
            return probed != null ? probed : "application/octet-stream";
        } catch (Exception e) {
            return "application/octet-stream";
        }
    }

    public static boolean isAllowedMimeType(String mimeType) {
        return ALLOWED_MIME_TYPES.contains(mimeType);
    }

    /** Strips path separators and null bytes so a filename can never be used for path traversal. */
    public static String sanitizeFileName(String rawFileName) {
        if (rawFileName == null) {
            return "unnamed";
        }
        return rawFileName
                .replace("\0", "")
                .replaceAll("[/\\\\]", "_")
                .trim();
    }
}
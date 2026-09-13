package com.resumeiq.shared.dto;

import java.time.Instant;
import java.util.UUID;

public record ResumeDTO(
        UUID id,
        String originalFileName,
        String contentHash,
        String extractedText,
        Instant uploadedAt
) {}
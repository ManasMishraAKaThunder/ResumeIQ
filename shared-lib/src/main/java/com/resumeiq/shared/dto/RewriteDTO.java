package com.resumeiq.shared.dto;

import java.util.UUID;

public record RewriteDTO(
        UUID resumeId,
        String section,
        String originalText,
        String rewrittenText
) {}
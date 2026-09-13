package com.resumeiq.shared.dto;

import java.util.List;
import java.util.UUID;

public record InterviewDTO(
        UUID sessionId,
        String jobTitle,
        List<String> questions,
        List<String> userAnswers,
        String feedback
) {}
package com.resumeiq.shared.dto;

import java.util.List;
import java.util.UUID;

public record ScoreDTO(
        UUID resumeId,
        int overallScore,
        int keywordMatchScore,
        int formattingScore,
        List<String> missingKeywords,
        List<String> feedback
) {}
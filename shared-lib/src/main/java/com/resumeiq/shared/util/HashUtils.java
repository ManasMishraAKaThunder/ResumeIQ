package com.resumeiq.shared.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public final class HashUtils {

    private HashUtils() {
        // utility class — never instantiated
    }

    public static String sha256(byte[] content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(content);
            return HexFormat.of().formatHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            // SHA-256 is guaranteed present on every JVM — this branch is unreachable
            throw new IllegalStateException("SHA-256 algorithm not available", e);
        }
    }

    public static String sha256(String content) {
        return sha256(content.getBytes(StandardCharsets.UTF_8));
    }
}
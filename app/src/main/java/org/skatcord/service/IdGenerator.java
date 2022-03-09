package org.skatcord.service;

public class IdGenerator {
    private static long lastGuildId = 0;
    private static long lastChannelId = 0;
    private static long lastUserId = 0;
    private static long lastMessageId = 0;

    public static long generateGuidId() {
        lastGuildId++;
        return lastGuildId;
    }

    public static long generateUserId() {
        lastUserId++;
        return lastUserId;
    }

    public static long generateMessageId() {
        lastMessageId++;
        return lastMessageId;
    }

    public static long generateChannelId() {
        lastChannelId++;
        return lastChannelId;
    }

}

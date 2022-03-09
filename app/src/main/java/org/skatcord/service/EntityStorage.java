package org.skatcord.service;

import org.skatcord.structure.Channel;
import org.skatcord.structure.Guild;
import org.skatcord.structure.Message;
import org.skatcord.structure.User;

import java.util.ArrayList;

public class EntityStorage {
    public static ArrayList<Guild> guilds = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Message> messages = new ArrayList<>();
    public static ArrayList<Channel> channels = new ArrayList<>();

    public static Guild getGuild(Channel c) {
        for (Guild guild : guilds) {
            if (guild.channels.contains(c)) {
                return guild;
            }
        }
        return null;
    }
}

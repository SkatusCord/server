package org.skatcord.structure;

import org.skatcord.service.EntityStorage;
import org.skatcord.service.IdGenerator;

import java.util.ArrayList;

public class Channel {
    public long id;
    public String name;
    public String description;
    public Guild guild;

    public ArrayList<Message> messages;

    public Channel(String name, String description, Guild guild) {
        this.id = IdGenerator.generateChannelId();
        this.name = name;
        this.description = description;
        this.guild = guild;
        this.messages = new ArrayList<>();

        EntityStorage.channels.add(this);
        guild.channels.add(this);
    }
}

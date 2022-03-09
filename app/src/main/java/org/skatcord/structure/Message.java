package org.skatcord.structure;

import org.skatcord.service.EntityStorage;
import org.skatcord.service.IdGenerator;

public class Message {
    public long id;
    public User author;
    public String content;

    public Channel channel;
    public Guild guild;

    public Message(User author, Channel channel, String content) {
        this.id = IdGenerator.generateMessageId();
        this.author = author;
        this.channel = channel;
        this.guild = EntityStorage.getGuild(channel);
        channel.messages.add(this);
        EntityStorage.messages.add(this);
        this.content = content;
    }
}

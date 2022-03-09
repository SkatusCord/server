package org.skatcord.structure;

import org.skatcord.service.EntityStorage;
import org.skatcord.service.IdGenerator;

import java.util.ArrayList;

public class Guild {
    public long id;
    public String name;
    public long owner;
    public ArrayList<Long> users;
    public ArrayList<Channel> channels;

    public Guild(String name, User owner) {
        this.id = IdGenerator.generateGuidId();
        this.name = name;
        this.owner = owner.id;
        users = new ArrayList<>();
        users.add(owner.id);
        channels = new ArrayList<>();
        EntityStorage.guilds.add(this);
    }
}

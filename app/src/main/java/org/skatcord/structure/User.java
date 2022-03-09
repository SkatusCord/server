package org.skatcord.structure;

import org.skatcord.service.EntityStorage;
import org.skatcord.service.IdGenerator;

import java.util.ArrayList;

public class User {
    public long id;
    public String name;
    public String login;
    public String password;
    public ArrayList<Guild> guilds;

    public User(String name, String login, String password) {
        this.id = IdGenerator.generateUserId();
        this.name = name;
        this.guilds = new ArrayList<>();
        this.login = login;
        this.password = password;
        EntityStorage.users.add(this);
    }
}

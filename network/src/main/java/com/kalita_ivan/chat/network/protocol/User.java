package com.kalita_ivan.chat.network.protocol;

import com.owlike.genson.annotation.JsonIgnore;

import java.util.HashMap;

public class User {
    private Long id;
    private String login;
    private String password;
    private String name;

    public User(Long id, String login, String password, String name) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static User fromHashMap(Object object) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof HashMap)) {
            return null;
        }
        HashMap<String, Object> map = (HashMap)object;
        return new User((Long)map.get("id"), (String)map.get("name"));
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return id;
    }

    @JsonIgnore
    public String getLogin() {
        return login;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }
}

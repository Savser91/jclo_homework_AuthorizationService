package ru.netology.autorizationservice.user;

import ru.netology.autorizationservice.authorities.Authorities;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class User {
    private final String name;
    private final String password;
    private final List<Authorities> authorities;

    public User(String name, String password, List<Authorities> authorities) {
        this.name = name;
        this.password = password;
        this.authorities = authorities;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.authorities = Collections.emptyList();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }
}

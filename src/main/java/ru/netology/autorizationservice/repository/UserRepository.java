package ru.netology.autorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.autorizationservice.authorities.Authorities;
import ru.netology.autorizationservice.user.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        int index = users.indexOf(new User(user, password));
        return index != -1 ? users.get(index).getAuthorities() : Collections.emptyList();
    }

    public String save(User user) {
        users.add(user);
        return user.getName();
    }
}

package org.repository;

import org.models.User;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, User> users = new HashMap<>();

    public User findByUsername(String username) {
        return users.get(username);
    }

    public void save(User user) {
        users.put(user.getUsername(), user);
    }
}
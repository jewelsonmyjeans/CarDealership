package org.service;

import org.models.User;
import org.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setHashedPassword(password); // You should hash the password
        userRepository.save(user);
        return user;
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getHashedPassword().equals(password)) { // You should check the hashed password
            return user;
        }
        return null;
    }
}
package org.controller;

import org.service.UserService;

public class UserController {
    private UserService userService;

    // constructor...

    public void registerEndpoint(String username, String password) {
        // call userService.register()...
    }

    public void loginEndpoint(String username, String password) {
        // call userService.login()...
    }
}
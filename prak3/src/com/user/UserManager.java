package com.user;

import java.util.ArrayList;
import java.util.List;

public class UserManager{
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
        System.out.println("Юзер добавлен: " + user);
    }

    public void removeUser(String email) {
        users.removeIf(user -> user.getEmail().equals(email));
        System.out.println("Юзер с эмейлом " + email + " удален");
    }

    public void updateUser(String email, String newName) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.setName(newName);
                System.out.println("Юзер обновлен: " + user);
            }
        }
    }
}


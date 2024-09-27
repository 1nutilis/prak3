package com.user;



public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        User user1 = new User("Сеня", "senya@pas.com");
        User user2 = new User("Феня", "fenya@pas.com");

        userManager.addUser(user1);
        userManager.addUser(user2);

        userManager.updateUser("senya@pas.com", "Вася");
        userManager.removeUser("upemail@asd.com");
    }
}
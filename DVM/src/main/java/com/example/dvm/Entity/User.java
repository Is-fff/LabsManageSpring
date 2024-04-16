package com.example.dvm.Entity;

import lombok.Getter;

@Getter
public class User {
    private String account;
    private String password;
    private String username;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public User(String account, String password, String username) {
        this.account = account;
        this.password = password;
        this.username = username;
    }
    public User getUser() {
        return this;
    }
    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}

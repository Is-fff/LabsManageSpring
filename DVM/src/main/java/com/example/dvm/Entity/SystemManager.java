package com.example.dvm.Entity;

public class SystemManager extends User {
    private String account;
    private String password;
    private String username;

    public SystemManager(String account, String password, String username) {
        super(account, password, username);
        this.account = account;
        this.password = password;
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

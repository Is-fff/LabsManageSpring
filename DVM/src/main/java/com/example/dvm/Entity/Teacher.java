package com.example.dvm.Entity;

public class Teacher extends User{
    private String account;
    private String password;
    private String username;
    private String job_title;

    public Teacher(String account, String password, String username, String job_title) {
        super(account, password, username);
        this.account = account;
        this.password = password;
        this.username = username;
        this.job_title = job_title;
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

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
}

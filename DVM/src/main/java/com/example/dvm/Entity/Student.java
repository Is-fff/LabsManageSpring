package com.example.dvm.Entity;

import lombok.Getter;

@Getter
public class Student extends User{
    private String account;
    private String password;
    private String username;
    private String major;
    private String class_num;


    public Student(String account, String password, String username, String major, String class_num) {
        super(account, password, username);
        this.account = account;
        this.password = password;
        this.username = username;
        this.major = major;
        this.class_num = class_num;
    }
    public Student(String account, String username, String major, String class_num) {
        super(account, username);
        this.account = account;
        this.username = username;
        this.major = major;
        this.class_num = class_num;
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

    public void setMajor(String major) {
        this.major = major;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
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

    public String getMajor() {
        return major;
    }

    public String getClass_num() {
        return class_num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", major='" + major + '\'' +
                ", class_num='" + class_num + '\'' +
                '}';
    }
}

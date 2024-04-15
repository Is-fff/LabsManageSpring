package com.example.dvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

@SpringBootApplication
public class DvmApplication {

    public static void main(String[] args) {
        try {
            //1.数据库连接的4个基本要素：
            String url = "jdbc:mysql://localhost:3306/dmv";
            String user = "root";
            String password = "00289823794";
            String driverName = "com.mysql.cj.jdbc.Driver";

            //2.实例化Driver
            Class clazz = Class.forName(driverName);
            Driver driver = (Driver) clazz.newInstance();
            //3.注册驱动
            DriverManager.registerDriver(driver);
            //4.获取连接
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SpringApplication.run(DvmApplication.class, args);
    }

}

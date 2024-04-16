package com.example.dvm;

import com.example.dvm.Entity.Student;
import com.example.dvm.Entity.User;
import com.example.dvm.Entity.UserRegister;
import com.example.dvm.Interface.IRegister;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.List;

@SpringBootApplication
@MapperScan("com.example.dvm.Mapper")
public class DvmApplication {

    public static void main(String[] args) throws IOException {
        UserRegister userRegister=new  UserRegister();
        userRegister.studentRegister("2222","wxj","rjgc","3","2234");

    }

}

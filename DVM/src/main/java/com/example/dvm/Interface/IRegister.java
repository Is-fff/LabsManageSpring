package com.example.dvm.Interface;

import jakarta.websocket.Session;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public interface IRegister {
    void systemManagerRegister(String account ,String username, String password);
    void labMemberRegister(String account ,String username,String job_title ,String password);
    void teacherRegister(String account ,String username,String job_title ,String password);
    void studentRegister(String account, String username, String major, String class_num, String password) throws IOException;
    SqlSession getSession() throws IOException;
}

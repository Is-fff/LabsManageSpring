package com.example.dvm.Entity;

import com.example.dvm.Interface.IRegister;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserRegister<UserMapper> implements IRegister {
    @Override
    public void systemManagerRegister(String account, String username, String password) {

    }

    @Override
    public void labMemberRegister(String account, String username, String job_title, String password) {

    }

    @Override
    public void teacherRegister(String account, String username, String job_title, String password) {

    }

    @Override
    public void studentRegister(String account, String username, String major, String class_num, String password) {

    }
    private void getRegisteredUser(){}


}

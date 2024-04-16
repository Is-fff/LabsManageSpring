package com.example.dvm.Entity;

import com.example.dvm.Interface.IRegister;
import jakarta.websocket.Session;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
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
    public void studentRegister(String account, String username, String major, String class_num, String password) throws IOException {
        SqlSession session = (SqlSession) getSession();
        User user=session.selectOne("findUserById",account);
//        List<User> list = session.selectList("selectAllUser");
//        System.out.println(list);
        if (user==null){
            session.insert("insertUser", new User(account,password));
            session.insert("insertStudent",new Student(account,username,major,class_num,password));
            session.commit();
        }
        else {
            System.out.println("该用户已存在");
            System.out.println(user);
        }
        session.close();
    }

    @Override
    public SqlSession getSession() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = factory.openSession();
        return (SqlSession) session;
    }

    private void getRegisteredUser(){}


}

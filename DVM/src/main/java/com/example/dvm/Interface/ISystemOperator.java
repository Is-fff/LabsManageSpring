package com.example.dvm.Interface;

import com.example.dvm.Entity.Term;

import java.util.List;

public interface ISystemOperator {
    boolean createStudent();
    boolean createTeacher();
    boolean createLabMember();
    List<Term> inquireTerm();
    boolean createWindow();

}

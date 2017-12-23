package com.ibingo.service;

import com.ibingo.dao.StudentDao;
import com.ibingo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService {

    private StudentDao dao;

    public List<Student> getStudentList() {
        return dao.getStudentList();
    }
}

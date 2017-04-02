package com.application.services;

import com.application.dao.StudentDao;
import com.application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ud on 2/4/17.
 */

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    @Override
    public void saveEmployee(Student student) {
        studentDao.saveEmployee(student);
    }

    @Override
    public List<Student> findAllEmployees() {
        return new ArrayList<Student>(studentDao.findAllEmployees());
    }

    @Override
    public void deleteEmployeeBySsn(int ssn) {
        studentDao.deleteEmployeeBySsn(ssn);
    }

    @Override
    public Student findBySsn(int ssn) {
        return studentDao.findBySsn(ssn);
    }

    @Override
    public void updateEmployee(Student student) {
            studentDao.updateEmployee(student);
    }
}

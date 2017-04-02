package com.application.dao;

import com.application.model.Student;

import java.util.List;

/**
 * Created by ud on 2/4/17.
 */
public interface StudentDao {

    void saveEmployee(Student student);

    List<Student> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Student findBySsn(String ssn);

    void updateEmployee(Student student);
}
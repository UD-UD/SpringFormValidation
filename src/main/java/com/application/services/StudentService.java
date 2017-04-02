package com.application.services;

import com.application.model.Student;

import java.util.List;

/**
 * Created by ud on 1/4/17.
 */
public interface StudentService {

    void saveEmployee(Student student);

    List<Student> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Student findBySsn(String ssn);

    void updateEmployee(Student student);
}

package com.application.dao;

import com.application.model.Student;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ud on 2/4/17.
 */
@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao implements StudentDao {
    @Override
    public void saveEmployee(Student student) {
        persist(student);
    }

    @Override
    public List<Student> findAllEmployees() {
        Criteria criteria = getSession().createCriteria(Student.class);
        return (List<Student>) criteria.list();
    }

    @Override
    public void deleteEmployeeBySsn(String id) {
        Query query = getSession().createSQLQuery("delete from Student where ssn = :ssn");
        query.setString("id", id);
        query.executeUpdate();
    }

    @Override
    public Student findBySsn(String id) {
        Criteria criteria = getSession().createCriteria(Student.class);
        criteria.add(Restrictions.eq("id",id));
        return (Student) criteria.uniqueResult();
    }

    @Override
    public void updateEmployee(Student student) {
        getSession().update(student);
    }
}

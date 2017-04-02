package com.application.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ud on 29/3/17.
 */

@Entity
@Table//(name = "STUDENT_DATA")
public class Student implements Serializable{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private int id;


    @Size(min=3,max = 30)
    @Column
    private String firstName;

    @Size(min=3, max=30)
    @Column
    private String lastName;

    @NotEmpty
    @Column
    private String sex;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past
    @NotNull
    @Column
    private Date dob;

    @Email
    @NotEmpty
    @Column
    private String email;

    @NotEmpty
    @Column
    private String section;

    @NotEmpty
    @Column
    private String country;

    @Column
    private boolean firstAttempt;



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isFirstAttempt() {
        return firstAttempt;
    }

    public void setFirstAttempt(boolean firstAttempt) {
        this.firstAttempt = firstAttempt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", section='" + section + '\'' +
                ", country='" + country + '\'' +
                ", firstAttempt=" + firstAttempt +
                '}';
    }
}

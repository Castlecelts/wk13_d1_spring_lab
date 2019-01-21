package com.codeclan.employeeTracking.employeeTracking.Models;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "No")
    private int employeeNo;
    @Column(name = "email")
    private String email;

    public Employee(String name, int age, int employeeNo, String email) {
        this.name = name;
        this.age = age;
        this.employeeNo = employeeNo;
        this.email = email;
    }

    public Employee(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

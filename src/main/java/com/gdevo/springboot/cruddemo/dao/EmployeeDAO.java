package com.gdevo.springboot.cruddemo.dao;

import com.gdevo.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}

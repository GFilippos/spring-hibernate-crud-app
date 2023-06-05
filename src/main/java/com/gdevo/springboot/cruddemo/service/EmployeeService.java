package com.gdevo.springboot.cruddemo.service;

import com.gdevo.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
}

package com.example.demo.service;

import com.example.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    // Create Operation
    Department saveDepartment(Department department);

    // Read Operation
    List<Department> fetchDepartmentList();

    // Update Operation
    Department updateDepartment(Department department, Long departmentId);

    // Delete Operation
    void deleteDepartmentById(Long departmentId);
}

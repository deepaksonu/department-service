package com.deepak.department.service;

import com.deepak.department.entity.Department;
import com.deepak.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department save(Department department) {
        log.info("Inside save method of DepartmentServices");
        return this.departmentRepository.save(department);
    }

    public Department findById(Long departmentId) {
        log.info("Inside findById method of DepartmentServices");
        return this.departmentRepository.findById(departmentId).orElse(new Department());
    }
}

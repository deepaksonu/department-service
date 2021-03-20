package com.deepak.department.controller;

import com.deepak.department.entity.Department;
import com.deepak.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department save(@RequestBody Department department){
        log.info("Inside save method of DepartmentController");
        return this.departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long departmentId){
        log.info("Inside findById method of DepartmentController " + departmentId);
        return this.departmentService.findById(departmentId);
    }

}

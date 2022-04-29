package com.csi.controller;


import com.csi.model.Department;
import com.csi.service.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentServices departmentServicesImpl;

    @PostMapping("/savedata")
    public String saveData(@RequestBody Department department){
        departmentServicesImpl.saveData(department);
        return " Data Saved Sucessfully";
    }
    @GetMapping("/getalldata")
    public List<Department> getAllData(){
        return departmentServicesImpl.getAllData();
    }
}

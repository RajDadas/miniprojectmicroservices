package com.csi.dao;

import com.csi.model.Department;
import com.csi.repo.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DepartmentDaoImpl {

    @Autowired
    DepartmentRepository departmentRepositoryImpl;
    public void saveData(Department department) {

        departmentRepositoryImpl.save(department);
    }

    public List<Department> getAllData() {
    return   departmentRepositoryImpl.findAll();
    }
}

package com.csi.service;

import com.csi.dao.DepartmentDaoImpl;
import com.csi.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServices {

    @Autowired
    DepartmentDaoImpl departmentDaoImpl;

    public void saveData(Department department) {
        departmentDaoImpl.saveData(department);
    }

    public List<Department> getAllData() {
        return  departmentDaoImpl.getAllData();
    }
}

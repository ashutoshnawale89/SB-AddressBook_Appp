package com.bridgelabz.EmployeePayrollApp.services;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.models.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empDatalist=new ArrayList<>();
        empDatalist.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Yogesh",750000)));
        return empDatalist;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(empId,new EmployeePayrollDTO("Yogesh",70000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData=null;
        empData=new EmployeePayrollData(1,empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
    }
}

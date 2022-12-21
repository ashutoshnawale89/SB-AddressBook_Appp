package com.bridgelabz.EmployeePayrollApp.services;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.models.EmployeePayrollData;
import com.bridgelabz.EmployeePayrollApp.repositary.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    @Autowired
    private EmployeeRepo employeeRepositary;
    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();


    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> empData=employeeRepositary.findAll();
         return empData;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId){
        EmployeePayrollData empData=employeeRepositary.findById(empId).get();
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(empPayrollDTO);
        employeeRepositary.save(empData);
        return empData;
    }


    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO) {
      EmployeePayrollData empData=new EmployeePayrollData(empId,empPayrollDTO);
      employeeRepositary.save(empData);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeeRepositary.deleteById(empId);
    }
}

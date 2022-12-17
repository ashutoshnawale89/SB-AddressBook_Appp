package com.bridgelabz.EmployeePayrollApp.controllers;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.bridgelabz.EmployeePayrollApp.dto.ResponseDTO;
import com.bridgelabz.EmployeePayrollApp.models.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        EmployeePayrollData empData=null;
        empData = new EmployeePayrollData(1 , new EmployeePayrollDTO("Yogesh",1500000));
        ResponseDTO respDTO=new ResponseDTO("Get Call Successful ",empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData empData=null;
        empData = new EmployeePayrollData(empId , new EmployeePayrollDTO("Yogesh",1500000));
        ResponseDTO respDTO=new ResponseDTO("Get Call Successful ",empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(
            @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData=null;
        empData = new EmployeePayrollData(1 , empPayrollDTO);
        ResponseDTO respDTO=new ResponseDTO("Created Employee Payroll Data Successfully ",empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(
            @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData=null;
        empData = new EmployeePayrollData(1 , empPayrollDTO);
        ResponseDTO respDTO=new ResponseDTO("Updated Employee Payroll Data Successfully ",empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(
            @PathVariable("empId") int empId) {
        ResponseDTO respDTO=new ResponseDTO("Deleted Employee Payroll Data Successfully and Employee ID is  ",empId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}

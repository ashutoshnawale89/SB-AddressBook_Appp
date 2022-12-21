package com.bridgelabz.EmployeePayrollApp.models;

import com.bridgelabz.EmployeePayrollApp.dto.EmployeePayrollDTO;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor
public class EmployeePayrollData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    private String name;
    private long salary;


    public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeId = employeeId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

    public EmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = employeeId;
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
    }


}

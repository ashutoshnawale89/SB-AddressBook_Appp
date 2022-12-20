package com.bridgelabz.EmployeePayrollApp.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmployeePayrollDTO {
        @NotEmpty(message = "Employee Name Cannot Be Null")
        public String name;
        @Min(value = 500,message = "Min Wage Should Be More Than 500")
        public long salary;

        public EmployeePayrollDTO(String name, long salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "EmployeePayrollDTO{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
}

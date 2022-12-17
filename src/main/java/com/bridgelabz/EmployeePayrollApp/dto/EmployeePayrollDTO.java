package com.bridgelabz.EmployeePayrollApp.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    public class EmployeePayrollDTO {
        public String name;
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

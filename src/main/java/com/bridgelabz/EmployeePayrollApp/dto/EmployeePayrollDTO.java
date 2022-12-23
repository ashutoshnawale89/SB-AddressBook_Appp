package com.bridgelabz.EmployeePayrollApp.dto;

import com.bridgelabz.EmployeePayrollApp.exceptions.EmployeePayrollExceptionalHandler;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.Message;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
public class EmployeePayrollDTO {
        @NotEmpty(message = "Employee Name Cannot Be Null")
        public String name;
        @Min(value = 500,message = "Min Wage Should Be More Than 500")
        public long salary;

        @NotEmpty(message = "Gender Cannot be Empty")
        @Size(min = 4, max = 6,message = "Gender should Male/Female/Other")
        public String gender;

//        @JsonFormat(pattern = "dd mm yyyy")
        @NotNull(message = "Start Date Should Not Be Empty")
        @PastOrPresent(message = "Start date Should be Past or Present Date")
        public LocalDate startDate;
        public String note;
        public String profilePic;
        @NotNull(message = "Employee Department Cannot Be Null")
        public List<String> department;
}

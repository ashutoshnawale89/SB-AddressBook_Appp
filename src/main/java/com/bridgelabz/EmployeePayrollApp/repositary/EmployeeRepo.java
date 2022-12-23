package com.bridgelabz.EmployeePayrollApp.repositary;

import com.bridgelabz.EmployeePayrollApp.models.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<EmployeePayrollData,Integer> {


    List<EmployeePayrollData> findEmployeesByDepartment(String department);
}

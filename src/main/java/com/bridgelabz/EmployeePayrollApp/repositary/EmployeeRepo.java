package com.bridgelabz.EmployeePayrollApp.repositary;

import com.bridgelabz.EmployeePayrollApp.models.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeePayrollData,Integer> {


}

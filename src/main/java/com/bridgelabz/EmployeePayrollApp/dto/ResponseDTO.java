package com.bridgelabz.EmployeePayrollApp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


public @Data class ResponseDTO {  // Data Tranfer Object
    private String message;
    private Object data;


    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }


}

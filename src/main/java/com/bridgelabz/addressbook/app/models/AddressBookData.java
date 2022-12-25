package com.bridgelabz.addressbook.app.models;

import com.bridgelabz.addressbook.app.dto.AddressBookDTO;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address_book")
public class AddressBookData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private int addressId;
    private String name;
    private String gender;

    private String address;

    private String city;
    private String state;
    private String pincode;

    private String phoneNumber;

    private String email;

    public AddressBookData(int addressId,AddressBookDTO employeePayrollDTO ) {
        this.addressId = addressId;
        this.name = employeePayrollDTO.name;
        this.gender = employeePayrollDTO.gender;
        this.address = employeePayrollDTO.address;
        this.city = employeePayrollDTO.city;
        this.state = employeePayrollDTO.state;
        this.pincode = employeePayrollDTO.pincode;
        this.phoneNumber = employeePayrollDTO.phoneNumber;
        this.email = employeePayrollDTO.email;
    }


    public AddressBookData(AddressBookDTO empPayrollDTO) {
        this.addressId = addressId;
        this.name = empPayrollDTO.name;
        this.gender = empPayrollDTO.gender;
        this.address = empPayrollDTO.address;
        this.city = empPayrollDTO.city;
        this.state = empPayrollDTO.state;
        this.pincode = empPayrollDTO.pincode;
        this.phoneNumber = empPayrollDTO.phoneNumber;
        this.email = empPayrollDTO.email;

    }
}

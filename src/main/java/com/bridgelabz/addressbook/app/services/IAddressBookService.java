package com.bridgelabz.addressbook.app.services;

import com.bridgelabz.addressbook.app.dto.AddressBookDTO;
import com.bridgelabz.addressbook.app.models.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int empId) throws Throwable;

    AddressBookData createAddressBookData(AddressBookDTO empPayrollDTO);

    AddressBookData updateAddressBookData(int empId, AddressBookDTO empPayrollDTO) throws Throwable;

    String deleteAddressBookData(int empId) throws Throwable;

    List<AddressBookData> getAddressBookByEmail(String email);


}

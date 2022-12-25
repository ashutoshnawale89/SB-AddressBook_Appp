package com.bridgelabz.addressbook.app.controllers;

import com.bridgelabz.addressbook.app.dto.AddressBookDTO;
import com.bridgelabz.addressbook.app.dto.ResponseDTO;
import com.bridgelabz.addressbook.app.models.AddressBookData;
import com.bridgelabz.addressbook.app.services.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/AddressBookservice")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;
    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addDataList=null;
        addDataList=addressBookService.getAddressBookData();
        ResponseDTO respDTO=new ResponseDTO("Get Call Successful ",addDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("Id") int Id) throws Throwable {
        AddressBookData addDataList=null;
        addDataList = addressBookService.getAddressBookDataById(Id);
        ResponseDTO respDTO=new ResponseDTO("Get Call Successfullly ",addDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(
             @Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addData=null;
        addData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO=new ResponseDTO("Created Employee Payroll Data Successfully ",addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("id") int id,
            @RequestBody AddressBookDTO addressBookDTO) throws Throwable {
        AddressBookData addData=null;
        addData =addressBookService.updateAddressBookData(id,addressBookDTO);
        ResponseDTO respDTO=new ResponseDTO("Updated Employee Payroll Data Successfully ",addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(
            @PathVariable("id") int id) throws Throwable {
        String addData=null;
        addData=addressBookService.deleteAddressBookData(id);
        ResponseDTO respDTO=new ResponseDTO("Deleted Employee Payroll Data ",addData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<ResponseDTO> getAddressBookDataByEmail(@PathVariable("email") String email) throws Throwable {
        List<AddressBookData> addDataList=null;
        addDataList = addressBookService.getAddressBookByEmail(email);
        ResponseDTO respDTO=new ResponseDTO("Get Call For ID Successfullly ",addDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}

package com.bridgelabz.addressbook.app.services;

import com.bridgelabz.addressbook.app.dto.AddressBookDTO;
import com.bridgelabz.addressbook.app.exceptions.AddressBookException;
import com.bridgelabz.addressbook.app.models.AddressBookData;
import com.bridgelabz.addressbook.app.repositary.AddressBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;

@Service
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepo addressRepositary;

    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addData=addressRepositary.findAll();
         return addData;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) throws Throwable {
        AddressBookData addData=addressRepositary.findById(id).orElseThrow(new Supplier<Throwable>() {
            @Override
            public Throwable get() {
                return new AddressBookException("ID of Employee is Not Found. Please Check The All Data Carefully");
            }});

        return addData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addData = new AddressBookData(addressBookDTO);
        addressRepositary.save(addData);
        return addData;
    }


    @Override
    public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) throws Throwable{
        AddressBookData addData=addressRepositary.findById(id).orElseThrow(new Supplier<Throwable>() {
            @Override
            public Throwable get() {
                return new AddressBookException("Address Book ID Not Found. Please Check The All Data Carefully");
            }});
      AddressBookData addData1=new AddressBookData(id,addressBookDTO);
        addressRepositary.save(addData1);
        return addData1;
    }

    @Override
    public String deleteAddressBookData(int id) throws Throwable  {
        AddressBookData addData=addressRepositary.findById(id).orElseThrow(new Supplier<Throwable>() {
            @Override
            public Throwable get() {
                return new AddressBookException("AddressBook ID Not Found. Please Check The All Data Carefully");
            }});
        addressRepositary.deleteById(id);
        return "Successfully Deleted ID Is  "+id ;
    }

    @Override
    public List<AddressBookData> getAddressBookByEmail(String email) {
        List<AddressBookData> addressBooks=null;
        addressBooks=addressRepositary.findAllByEmail(email);
        if(addressBooks.isEmpty()){
            throw new AddressBookException("Email Not Found in Address Book Data ");
        }else {
            return addressBooks;
        }
    }

}

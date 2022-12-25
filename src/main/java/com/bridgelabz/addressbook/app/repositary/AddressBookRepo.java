package com.bridgelabz.addressbook.app.repositary;

import com.bridgelabz.addressbook.app.models.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressBookRepo extends JpaRepository<AddressBookData,Integer> {


    List<AddressBookData> findAllByEmail(String email);
}

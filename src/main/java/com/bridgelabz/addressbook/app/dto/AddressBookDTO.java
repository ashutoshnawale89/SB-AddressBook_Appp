package com.bridgelabz.addressbook.app.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
public class AddressBookDTO {
        @NotEmpty(message = " Name Cannot Be Null")
        @Pattern(regexp="^[a-zA-Z]{3,}$",message="Name Must Be 3 Digits")
        public String name;
        @NotEmpty(message = "Gender Cannot be Empty")
        @Size(min = 4, max = 6,message = "Gender should Male/Female/Other")
        public String gender;
        @NotEmpty(message = "Address Cannot Be Empty")
        @Pattern(regexp="^[a-zA-Z]{3,}$",message="Address Must Be 3 Digits")
        public String address;
        @NotEmpty(message = "City Cannot Be Empty")
        public String city;

        @NotEmpty(message = "State Cannot Be Empty")
        public String state;


    @Pattern(regexp="^[0-9]{6}$",message="Pincode Must Be Only 6 Digits")
    public String pincode;

    @Pattern(regexp="^[0-9]{10}$",message="Mobile Number Must Be Only 10 Digits")
    public String phoneNumber;

        @Email(message = "Enter The Proper Email Format")
        public String email;
}

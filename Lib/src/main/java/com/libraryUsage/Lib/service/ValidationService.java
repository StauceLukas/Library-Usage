package com.libraryUsage.Lib.service;


import com.libraryUsage.Lib.service.implementation.EmailValidator;
import com.libraryUsage.Lib.service.implementation.PasswordValidator;
import com.libraryUsage.Lib.service.implementation.PhoneNumberValidator;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

    private EmailValidator emailVal;
    private PasswordValidator passVal;
    private PhoneNumberValidator phoneVal;

    public boolean isEmailValid(String email){
        emailVal = new EmailValidator();
        return emailVal.isValid(email);
    }
    public boolean isPassValid(String pass){
        passVal = new PasswordValidator();
        return passVal.isValid(pass);
    }
    public boolean isPhoneValid(String phone){
        phoneVal = new PhoneNumberValidator();
        return phoneVal.isValid(phone);
    }
}

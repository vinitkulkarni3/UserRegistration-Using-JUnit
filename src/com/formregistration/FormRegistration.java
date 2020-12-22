package com.formregistration;

import java.util.regex.Pattern;

public class FormRegistration 
{   
    //Constants
    final String FIRSTNAMEPATTERN =  "^[A-Z]{1}[a-z]{2,}$";
    final String LASTNAMEPATTERN = "^[A-Z]{1}[a-z]{2,}$";
    final String EMAILPATTERN = "^[a-zA-Z0-9\\\\-\\\\+\\\\.]+.([a-zA-Z0-9])*@([a-z0-9]+.[a-z]{2,}.([a-z]{2,})?)$";
    final String MOBILEPATTERN = "^[0-9]{2}[-]?[0-9]{10}$";
    final String PASSWORPATTERN = "^(?=[A-Za-z0-9!@#]{8,}$)(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).*";
    
    //First Name validation
    public boolean firstNameValidation(String firstName)
    {
        boolean firstNameFlag = false;
        if(Pattern.matches(FIRSTNAMEPATTERN, firstName))
        {
            firstNameFlag = true;
        }
        else
        {
            firstNameFlag = false;
        }
        return firstNameFlag;
    }
    
    //Last Name validation
    public boolean lastNameValidation(String lastName)
    {
        boolean lastNameFlag = false;
        if(Pattern.matches(LASTNAMEPATTERN, lastName))
        {
            lastNameFlag = true;
        }
        else
        {
            lastNameFlag = false;
        }
        return lastNameFlag;
    }
    
    //Email ID validation
    public boolean emailValidation(String email)
    {
        boolean emailFlag = false;
        if(Pattern.matches(EMAILPATTERN, email))
        {
            emailFlag = true;
        }
        else
        {
            emailFlag = false;
        }
        return emailFlag;
    }
    
    //Mobile Number validation
    public boolean mobileNumberValidation(String mobileNumber)
    {
        boolean mobileFlag = false;
        if(Pattern.matches(MOBILEPATTERN, mobileNumber))
        {
           mobileFlag = true;
        }
        else
        {
           mobileFlag = false;
        }
        return mobileFlag;
    }
    
    //Password validation
    public boolean passwordValidation(String password)
    {
        boolean passwordFlag = false;
        if(Pattern.matches(PASSWORPATTERN, password))
        {
            passwordFlag = true;
        }
        else
        {
            passwordFlag = false;
        }
        return passwordFlag;
    }
    
    //Multiple email validation
    public boolean multipleEmailvalidate(String email)
    {
        if(Pattern.matches(EMAILPATTERN, email))
        {
            return true;
        }
        else
        {
            return false;
        }    
    }
}

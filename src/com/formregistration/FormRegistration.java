package com.formregistration;

import java.util.regex.Pattern;

public class FormRegistration 
{   
    //Constants
    final String FIRSTNAMEPATTERN =  "^[A-Z]{1}[a-z]{2,}$";
    final String LASTNAMEPATTERN = "^[A-Z]{1}[a-z]{2,}$";
    
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
}

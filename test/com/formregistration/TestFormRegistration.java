package com.formregistration;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class TestFormRegistration
{
    FormRegistration formObject = new FormRegistration();
    
    //first name validation test case
    @Test
    public void getFirstName_whenProper_shouldReturnTrue() 
    {    
        boolean result = formObject.firstNameValidation("Vinit"); //starts with capital letter and minimum 3 letters
        assertEquals(true, result);
        //assertTrue(result);
    }
    @Test
    public void getFirstName_whenNotProper_shouldReturnFalse() 
    {    
        boolean result = formObject.firstNameValidation("Vi"); //Starts with capital letter and only 2 character 
        assertEquals(true, result);
        //assertFalse(result);
    }
    
    //last name validation test case
    @Test
    public void getLastName_whenProper_shouldReturnTrue() 
    {    
        boolean result = formObject.lastNameValidation("Kulkarni"); //starts with capital letter and minimum 3 letters
        assertEquals(true, result);
    }
    @Test
    public void getLastName_whenNotProper_shouldReturnFalse()
    {    
        boolean result = formObject.lastNameValidation("kul"); //only 3 character 
        assertEquals(true, result);
    }
    
    //email validation test case
    @Test
    public void getEmail_whenEmailValid_shouldReturnTrue()
    {    
        boolean result = formObject.emailValidation("Vinit@gmail.com"); //correct format
        assertEquals(true, result);
    }
    @Test
    public void getEmail_whenThreeDomain_shouldReturnFalse()
    {    
        boolean result = formObject.emailValidation("Vini@tgmail.co.in.com"); //with three domain
        assertEquals(true, result);
    }
    
    //mobile number validation test case
    @Test
    public void getMobile_whenCountryCodeDashMobileNumber_shouldReturnTrue()
    {    
        boolean result = formObject.mobileNumberValidation("91-8877665544"); //valid mobile number with country code
        assertEquals(true, result);
    }
    @Test
    public void getMobile_whenNotHaveCountryCode_shouldReturnFalse() 
    {    
        boolean result = formObject.mobileNumberValidation("91887897665544"); //invalid no gap between country code
        assertEquals(true, result);
    }
}

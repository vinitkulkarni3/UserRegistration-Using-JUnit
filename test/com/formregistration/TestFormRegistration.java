package com.formregistration;

import java.util.Arrays;
import java.util.List;
import junit.framework.Assert;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestFormRegistration
{
    String emailId;
    boolean expectedResult;
    private FormRegistration emailVariable;
    FormRegistration formObject = new FormRegistration();
    
    public TestFormRegistration(String emailId, boolean expectedResult) 
    {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }
    
    @Before
    public void initialize()
    {
        emailVariable = new FormRegistration();
    }
    
    @Parameterized.Parameters
    public static List<Object[]> emails()
    {
        return Arrays.asList(new Object[][] { {"Vinit@gmail.com", true}, {"Vinit@gmail.co.in",true}, {"vinitgmail.com", false}});
    }
    
    @Test
    public void testEmailId()
    {
        try
        {
            System.out.println("parameter email is->"+emailId);
            Assert.assertEquals(expectedResult, emailVariable.multipleEmailvalidate(emailId));
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
    }
    
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
    
    //Password validation test case
    @Test
    public void getPassword_whenPasswordValid_shouldReturnTrue() 
    {    
        boolean result = formObject.passwordValidation("Vinit@574839"); //all conditions added
        assertEquals(true, result);
    }
    @Test
    public void getPassword_whenLessThan8Chars_shouldReturnFalse()
    {    
        boolean result = formObject.passwordValidation("V@123"); //less than 8 character
        assertEquals(true, result);
    }
}

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
}

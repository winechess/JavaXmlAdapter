/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinichenkosa.javaxmladapter.adapters;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinichenkosa
 */
public class StringToDateAdapterTest {

    public StringToDateAdapterTest() {
    }

    @Test
    public void testUnmarshal() throws Exception {
        System.out.println("should convert string to date");
        //Arrange    
        String dateAsString = "22.11.2000";
        StringToDateAdapter adapter = new StringToDateAdapter();
        GregorianCalendar gc = new GregorianCalendar();
        gc.clear();
        gc.set(2000, 10, 22);
        
        Date expectedDate = gc.getTime();
        //Act
        Date date = adapter.unmarshal(dateAsString);
        //Assert
        
        assertThat("result date should not be null", date, notNullValue());
        assertThat("result date should equal expected date", date, equalTo(expectedDate));
    }

    @Test
    public void testMarshal() throws Exception {
        System.out.println("sould convert date to string");
        //Arrange
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(2000, 10, 22);
        Date expectedDate = gc.getTime();
        String dateStringExpected = "22.11.2000";
        StringToDateAdapter adapter = new StringToDateAdapter();
        //Act
        String dateStirng = adapter.marshal(expectedDate);
        //Assert
        assertThat("should equal expected string date", dateStirng, equalTo(dateStringExpected));
    }

}

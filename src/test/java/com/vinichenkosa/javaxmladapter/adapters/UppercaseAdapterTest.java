/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vinichenkosa.javaxmladapter.adapters;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinichenkosa
 */
public class UppercaseAdapterTest {
    
    public UppercaseAdapterTest() {
    }

    @Test
    public void testUnmarshal() throws Exception {
        System.out.println("should convert string to upper registry");
        //Arrange
        String sourceString = "aBcDe";
        String expectedString = "ABCDE";
        UppercaseAdapter adapter = new UppercaseAdapter();
        //Act
        String actualString = adapter.unmarshal(sourceString);
        //Assert
        assertThat(actualString, is(expectedString));
    }

    @Test
    public void testMarshal() throws Exception {
        System.out.println("should return string as is");
        //Arrange
        String sourceString = "aBcDe";
        UppercaseAdapter adapter = new UppercaseAdapter();
        //Act
        String actualString = adapter.marshal(sourceString);
        //Assert
        assertThat(actualString, is(sourceString));
    }
    
}

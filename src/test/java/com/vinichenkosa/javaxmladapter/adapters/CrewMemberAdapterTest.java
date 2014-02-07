/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vinichenkosa.javaxmladapter.adapters;

import com.vinichenkosa.javaxmladapter.models.Member;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinichenkosa
 */
public class CrewMemberAdapterTest {
    
    public CrewMemberAdapterTest() {
    }

    @Test
    public void testUnmarshal() throws Exception {
        System.out.println("should marshall string to Member object");
        //Arrange
        String memberAsString = "Tom Hanks";
        CrewMemberAdapter adapter = new CrewMemberAdapter();
        //Act
        Member member = adapter.unmarshal(memberAsString);
        //Assert
        assertThat(member, notNullValue());
        assertThat(member.getName(), is("Tom"));
        assertThat(member.getSurname(), is("Hanks"));
        
    }

    @Test
    public void testMarshal() throws Exception {
        System.out.println("should unmarshall Member object");
        //Arrange
        Member member = new Member();
        member.setName("Tom");
        member.setSurname("Hanks");
        CrewMemberAdapter adapter = new CrewMemberAdapter();
        String expResult = "Tom Hanks";
        //Act
        String actualResult = adapter.marshal(member);
        //Assert
        assertThat(actualResult, is(expResult));
    }
    
}

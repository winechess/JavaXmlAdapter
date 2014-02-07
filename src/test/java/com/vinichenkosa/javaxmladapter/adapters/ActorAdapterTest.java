/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vinichenkosa.javaxmladapter.adapters;

import com.vinichenkosa.javaxmladapter.models.Actor;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author vinichenkosa
 */
public class ActorAdapterTest {
    
    @Test
    public void testActorUnmarshaller() throws Exception{
        System.out.println("should fill fullName field");
        //Arrange
        Actor originActor = new Actor();
        originActor.setName("Tom");
        originActor.setSurname("Hanks");
        ActorAdapter adapter = new ActorAdapter();
        //Act
        Actor actualActor = adapter.unmarshal(originActor);
        //Assert
        assertThat(actualActor, notNullValue());
        assertThat(actualActor.getFullName(), is("Tom Hanks"));
    }
    
    @Test
    public void testActorMarshaller() throws Exception{
        System.out.println("should simply return same object");
        //Arrange
        Actor originActor = new Actor();
        originActor.setName("Tom");
        originActor.setSurname("Hanks");
        ActorAdapter adapter = new ActorAdapter();
        //Act
        Actor actualActor = adapter.marshal(originActor);
        //Assert
        assertThat(actualActor, notNullValue());
        assertThat(actualActor, is(originActor));
    }
}

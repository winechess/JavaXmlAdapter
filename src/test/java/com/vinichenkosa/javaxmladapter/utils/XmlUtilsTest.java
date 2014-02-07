/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinichenkosa.javaxmladapter.utils;

import com.vinichenkosa.javaxmladapter.models.Film;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vinichenkosa
 */
public class XmlUtilsTest {

    @Test
    public void testUnmarshallFromString() throws Exception {
        System.out.println("should unmarshall xml from string");
        //Arrange
        URL xmlDataURL = getClass().getResource("/films.xml");
        Path xmlDataPath = Paths.get(xmlDataURL.toURI());
        String xmlDataString = new String(Files.readAllBytes(xmlDataPath), "utf-8");
        //Act
        Film film = XmlUtils.unmarshall(xmlDataString, Film.class);
        //Assert
        assertThat("Film must not be null",film, notNullValue());
        assertThat("List of actors must not be null", film.getActors(), notNullValue());
        assertThat("Number of actors must be equal to 5", film.getActors().size(), is(5));
        assertThat("List of crew members must not be null", film.getCrew().size(), notNullValue());
        assertThat("Number of members must be equal to 6", film.getCrew().size(), is(6));
    }

    @Test
    public void testUnmarshallFromInputStream() throws Exception {
        System.out.println("should unmarshall xml from InputStream");
        //Arrange
        InputStream xmlDataIS = getClass().getResourceAsStream("/films.xml");
        //Act
        Film film = XmlUtils.unmarshall(xmlDataIS, Film.class);
        //Assert
        assertThat("Film must not be null",film, notNullValue());
        assertThat("List of actors must not be null", film.getActors(), notNullValue());
        assertThat("Number of actors must be equal to 5", film.getActors().size(), is(5));
        assertThat("List of crew members must not be null", film.getCrew().size(), notNullValue());
        assertThat("Number of members must be equal to 6", film.getCrew().size(), is(6));
    }

}

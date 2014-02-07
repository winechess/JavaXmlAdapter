package com.vinichenkosa.javaxmladapter;

import com.vinichenkosa.javaxmladapter.utils.XmlUtils;
import com.vinichenkosa.javaxmladapter.models.Film;
import java.io.InputStream;
import javax.xml.bind.JAXBException;

public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
        InputStream xml = App.class.getResourceAsStream("/films.xml");
        Film film = XmlUtils.unmarshall(xml, Film.class);
        System.out.println(film.toString());
    }
}

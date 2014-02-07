/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinichenkosa.javaxmladapter.utils;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author vinichenkosa
 */
public class XmlUtils {

    @SuppressWarnings("unchecked")
    public static <T> T unmarshall(String xml, Class<T> cl) throws JAXBException, UnsupportedEncodingException {

        JAXBContext jaxbCtx = JAXBContext.newInstance(cl);
        Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
        return (T) unmarshaller.unmarshal(new ByteArrayInputStream(xml.getBytes("UTF-8")));

    }
    
    @SuppressWarnings("unchecked")
    public static <T> T unmarshall(InputStream xml, Class<T> cl) throws JAXBException{

        JAXBContext jaxbCtx = JAXBContext.newInstance(cl);
        Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
        return (T) unmarshaller.unmarshal(xml);

    }
}

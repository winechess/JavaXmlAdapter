package com.vinichenkosa.javaxmladapter.adapters;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class StringToDateAdapter extends XmlAdapter<String, Date> {

    private final SimpleDateFormat dateFormatter;

    public StringToDateAdapter() {
        this.dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
    }

    @Override
    public Date unmarshal(String dateAsString) throws Exception {

        return dateFormatter.parse(dateAsString);
    }

    @Override
    public String marshal(Date date) throws Exception {
        return dateFormatter.format(date);
    }
}
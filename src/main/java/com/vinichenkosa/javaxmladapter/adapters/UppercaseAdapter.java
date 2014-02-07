package com.vinichenkosa.javaxmladapter.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class UppercaseAdapter extends XmlAdapter<String, String> {

    @Override
    public String unmarshal(String v) throws Exception {
        return v.toUpperCase();
    }

    @Override
    public String marshal(String v) throws Exception {
        return v;
    }
}

package com.vinichenkosa.javaxmladapter.models;

import com.vinichenkosa.javaxmladapter.adapters.CrewMemberAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(CrewMemberAdapter.class)
public class Member {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", surname=" + surname + '}';
    }
}
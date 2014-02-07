package com.vinichenkosa.javaxmladapter.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import com.vinichenkosa.javaxmladapter.models.Member;

public class CrewMemberAdapter extends XmlAdapter<String, Member> {

    @Override
    public Member unmarshal(String v) throws Exception {
        Member member = new Member();
        String[] a = v.split(" ");
        member.setName(a[0]);
        member.setSurname(a[1]);
        return member;
    }

    @Override
    public String marshal(Member v) throws Exception {
        return v.getName()+" "+v.getSurname();
    } 
}
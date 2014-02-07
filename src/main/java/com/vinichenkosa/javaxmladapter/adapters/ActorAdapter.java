package com.vinichenkosa.javaxmladapter.adapters;

import com.vinichenkosa.javaxmladapter.models.Actor;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ActorAdapter extends XmlAdapter<Actor, Actor>{

    @Override
    public Actor unmarshal(Actor v) throws Exception {
        v.setFullName(v.getName() + " " + v.getSurname());
        return v;
    }

    @Override
    public Actor marshal(Actor v) throws Exception {
        return v;
    }
}
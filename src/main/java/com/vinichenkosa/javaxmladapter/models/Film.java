package com.vinichenkosa.javaxmladapter.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "film")
@XmlAccessorType(XmlAccessType.NONE)
public class Film {

    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "releaseDate")
    private Date releaseDate;
    @XmlElementWrapper(name = "actors")
    @XmlElement(name = "actor")
    private List<Actor> actors;
    @XmlElementWrapper(name = "crew")
    @XmlElement(name = "member")
    private List<Member> crew;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Actor> getActors() {
        if (actors == null) {
            actors = new ArrayList();
        }
        return actors;
    }

    public List<Member> getCrew() {
        return crew;
    }

    public void setCrew(List<Member> crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return "Film{" + "title=" + title + ", description=" + description + ", releaseDate=" + releaseDate + ", actors=" + actors + ", crew=" + crew + '}';
    }
}

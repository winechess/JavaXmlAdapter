package com.vinichenkosa.javaxmladapter.models;

import com.vinichenkosa.javaxmladapter.adapters.StringToDateAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="film")
@XmlAccessorType(XmlAccessType.NONE)
public class Film {

    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description")
    private String description;
    @XmlJavaTypeAdapter(StringToDateAdapter.class)
    @XmlElement(name = "releaseDate")
    private Date releaseDate;
    @XmlElementWrapper(name="actors")
    @XmlElement(name="actor")
    private List<Actor> actors;

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
        if(actors == null){
            actors = new ArrayList();
        }
        return actors;
    }

    @Override
    public String toString() {
        return "Film{" + "title=" + title + ", description=" + 
        description + ", releaseDate=" + releaseDate + ", actors=" +
        actors.toString() + '}';
    } 
}
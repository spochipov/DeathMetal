package com.library_DM.DeathMetal.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ALBUMS")
public class AlbumEntity {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "band")
    @JsonManagedReference
    private BandEntity band;

    private String title;

    private long year;

    @OneToMany(mappedBy = "album")
    private List<ReviewEntity> reviewes;

    public AlbumEntity() {
    }

    public AlbumEntity(long id, String title, long year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public BandEntity getBand() {
        return band;
    }

    public String getTitle() {
        return title;
    }

    public long getYear() {
        return year;
    }

    public List<ReviewEntity> getReviewes() {
        return reviewes;
    }
}

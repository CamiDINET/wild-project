package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Boiling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int water;
    //private Long ingredient_id;
    @OneToMany(mappedBy = "boiling")
    private List<HopList> hops;
    @OneToMany(mappedBy = "boiling")
    private List<VariousList> various;

    public Boiling() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public List<HopList> getHops() {
        return hops;
    }

    public void setHops(List<HopList> hops) {
        this.hops = hops;
    }

    public List<VariousList> getVarious() {
        return various;
    }

    public void setVarious(List<VariousList> various) {
        this.various = various;
    }
}

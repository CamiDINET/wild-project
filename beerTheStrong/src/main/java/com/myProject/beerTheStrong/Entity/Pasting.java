package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Pasting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int water;

    @OneToMany(mappedBy = "pasting")
    private List<MaltList> malts;

    public Pasting() {}

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

    public List<MaltList> getMalts() {
        return malts;
    }

    public void setMalts(List<MaltList> malts) {
        this.malts = malts;
    }
}

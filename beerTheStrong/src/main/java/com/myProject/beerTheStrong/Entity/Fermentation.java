package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Fermentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int temperatureFermentation; //degrès Celsius
    private int durationFermentation; //jour(s)
    private int durationGuard;
   // private Long ingredient_id;
   @OneToMany(mappedBy = "fermentation")
   private List<YeastList> yeasts;
    @OneToMany(mappedBy = "fermentation")
    private List<HopList> hops;

    public Fermentation() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTemperatureFermentation() {
        return temperatureFermentation;
    }

    public void setTemperatureFermentation(int temperatureFermentation) {
        this.temperatureFermentation = temperatureFermentation;
    }

    public int getDurationFermentation() {
        return durationFermentation;
    }

    public void setDurationFermentation(int durationFermentation) {
        this.durationFermentation = durationFermentation;
    }

    public int getDurationGuard() {
        return durationGuard;
    }

    public void setDurationGuard(int durationGuard) {
        this.durationGuard = durationGuard;
    }

    public List<YeastList> getYeasts() {
        return yeasts;
    }

    public void setYeasts(List<YeastList> yeasts) {
        this.yeasts = yeasts;
    }

    public List<HopList> getHops() {
        return hops;
    }

    public void setHops(List<HopList> hops) {
        this.hops = hops;
    }
}

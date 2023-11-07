package com.myProject.beerTheStrong.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class HopList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private Long hop_id;
    private int quantity;
    private int whenAdd; //minute(s)
    @ManyToOne
    @JoinColumn(name = "hopStock_id")
    private HopStock hopStock;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "boiling_id")
    private Boiling boiling;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "fermentation_id")
    private Fermentation fermentation;

    public HopList() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWhenAdd() {
        return whenAdd;
    }

    public void setWhenAdd(int whenAdd) {
        this.whenAdd = whenAdd;
    }

    public HopStock getHop() {
        return hopStock;
    }

    public void setHop(HopStock hopStock) {
        this.hopStock = hopStock;
    }

    public Boiling getBoiling() {
        return boiling;
    }

    public void setBoiling(Boiling boiling) {
        this.boiling = boiling;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
    }
}

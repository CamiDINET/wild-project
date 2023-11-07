package com.myProject.beerTheStrong.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class YeastList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String whenAdd;
    private int quantity; //gramme(s)
    @ManyToOne
    @JoinColumn(name = "yeastStock_id")
    private YeastStock yeastStock;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "fermentation_id")

    private Fermentation fermentation;

    public YeastList() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhenAdd() {
        return whenAdd;
    }

    public void setWhenAdd(String whenAdd) {
        this.whenAdd = whenAdd;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public YeastStock getYeast() {
        return yeastStock;
    }

    public void setYeast(YeastStock yeastStock) {
        this.yeastStock = yeastStock;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
    }
}

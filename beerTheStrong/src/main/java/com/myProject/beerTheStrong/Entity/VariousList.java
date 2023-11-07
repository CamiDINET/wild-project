package com.myProject.beerTheStrong.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class VariousList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity; //gramme(s)
    private int whenAdd; //minute(s)
    @ManyToOne
    @JoinColumn(name = "variousStock_id")
    private VariousStock variousStock;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "boiling_id")
    private Boiling boiling;

    public VariousList() {}

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

    public VariousStock getVarious() {
        return variousStock;
    }

    public void setVarious(VariousStock variousStock) {
        this.variousStock = variousStock;
    }

    public Boiling getBoiling() {
        return boiling;
    }

    public void setBoiling(Boiling boiling) {
        this.boiling = boiling;
    }
}

package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.*;


@Entity
public class VariousStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "various_id")
    private Various various;
    private int stockQuantity;

    public VariousStock() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Various getVarious() {
        return various;
    }

    public void setVarious(Various various) {
        this.various = various;
    }
}

package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.*;


@Entity
public class MaltStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "malt_id")
    private Malt malt;
    private int ebc;
    private int stockQuantity;
    public MaltStock() {}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getEbc() {
        return ebc;
    }
    public void setEbc(int ebc) {
        this.ebc = ebc;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public Malt getMalt() {
        return malt;
    }
    public void setMalt(Malt malt) {
        this.malt = malt;
    }


}

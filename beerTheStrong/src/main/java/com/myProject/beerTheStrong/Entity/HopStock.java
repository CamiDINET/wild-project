package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.*;

@Entity
public class HopStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hop_id")
    private Hop hop;
    private String country;
    //@NotBlank
    private float alphaAcid;

    private int stockQuantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getAlphaAcid() {
        return alphaAcid;
    }

    public void setAlphaAcid(float alphaAcid) {
        this.alphaAcid = alphaAcid;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Hop getHop() {
        return hop;
    }

    public void setHop(Hop hop) {
        this.hop = hop;
    }
}

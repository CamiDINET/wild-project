package com.myProject.beerTheStrong.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class MaltList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity; //gramme(s)
    @ManyToOne
    @JoinColumn(name = "maltStock_id")
    private MaltStock maltStock;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "pasting_id")
    private Pasting pasting;

    public MaltList() {}

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

    public MaltStock getMalt() {
        return maltStock;
    }

    public void setMalt(MaltStock maltStock) {
        this.maltStock = maltStock;
    }

    public Pasting getPasting() {
        return pasting;
    }

    public void setPasting(Pasting pasting) {
        this.pasting = pasting;
    }
}

package com.myProject.beerTheStrong.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @CreationTimestamp
    private LocalDate date;
    private int liter;
    private float initialDensity;
    private float finalDensity;
    private float initialDegreeBrix;
    private float finalDegreeBrix;
    private float alcohol;
    private int ibu;
    private int ebc;
    @ManyToOne
    @JoinColumn(name = "fermentation_id")
    private Fermentation fermentation;
    @ManyToOne
    @JoinColumn(name = "boiling_id")
    private Boiling boiling;
    @ManyToOne
    @JoinColumn(name = "pasting_id")
    private Pasting pasting;

    public Recipe() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public float getInitialDensity() {
        return initialDensity;
    }

    public void setInitialDensity(float initialDensity) {
        this.initialDensity = initialDensity;
    }

    public float getFinalDensity() {
        return finalDensity;
    }

    public void setFinalDensity(float finalDensity) {
        this.finalDensity = finalDensity;
    }

    public float getInitialDegreeBrix() {
        return initialDegreeBrix;
    }

    public void setInitialDegreeBrix(float initialDegreeBrix) {
        this.initialDegreeBrix = initialDegreeBrix;
    }

    public float getFinalDegreeBrix() {
        return finalDegreeBrix;
    }

    public void setFinalDegreeBrix(float finalDegreeBrix) {
        this.finalDegreeBrix = finalDegreeBrix;
    }

    public float getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(float alcohol) {
        this.alcohol = alcohol;
    }

    public int getIbu() {
        return ibu;
    }

    public void setIbu(int ibu) {
        this.ibu = ibu;
    }

    public int getEbc() {
        return ebc;
    }

    public void setEbc(int ebc) {
        this.ebc = ebc;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
    }

    public Boiling getBoiling() {
        return boiling;
    }

    public void setBoiling(Boiling boiling) {
        this.boiling = boiling;
    }

    public Pasting getPasting() {
        return pasting;
    }

    public void setPasting(Pasting pasting) {
        this.pasting = pasting;
    }
}

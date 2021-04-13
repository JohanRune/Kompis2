package com.example.kompis2.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Johan Rune
 * Date: 2021-04-12
 * Time: 17:21
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Kompis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    protected String namn;
    protected String epost;
    protected String telefonnummer;

    public Kompis (){}

    public Kompis(String namn, String epost, String telefonnummer){
        this.namn = namn;
        this.epost = epost;
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString(){
        return String.format(
                "Kompis[id='%d', namn='%s', epost='%s', telefonnummer='%d']",
                id, namn, epost, telefonnummer);
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.FonctionGeneralise;

/**
 *
 * @author Kanto
 */
public class Vehicule {

    int id, idmarque, idmodele, idtype;
    String numerovehicule;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdmarque() {
        return idmarque;
    }

    public void setIdmarque(int idmarque) {
        this.idmarque = idmarque;
    }

    public int getIdmodele() {
        return idmodele;
    }

    public void setIdmodele(int idmodele) {
        this.idmodele = idmodele;
    }

    public int getIdtype() {
        return idtype;
    }

    public void setIdtype(int idtype) {
        this.idtype = idtype;
    }

    public String getNumerovehicule() {
        return numerovehicule;
    }

    public void setNumerovehicule(String numerovehicule) {
        this.numerovehicule = numerovehicule;
    }
    
    public void insertVehicule(FonctionGeneralise f,Vehicule v) throws Exception{
        f.insert(v);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Kanto
 */
public class Maintenancevehicule {

    int id, idvehicule, idtypemaintenance;
    double limitekilometrage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdvehicule() {
        return idvehicule;
    }

    public void setIdvehicule(int idvehicule) {
        this.idvehicule = idvehicule;
    }

    public int getIdtypemaintenance() {
        return idtypemaintenance;
    }

    public void setIdtypemaintenance(int idtypemaintenance) {
        this.idtypemaintenance = idtypemaintenance;
    }

    public double getLimitekilometrage() {
        return limitekilometrage;
    }

    public void setLimitekilometrage(double limitekilometrage) {
        this.limitekilometrage = limitekilometrage;
    }

}

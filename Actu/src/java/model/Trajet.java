/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.FonctionGeneralise;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Kanto
 */
public class Trajet {

    int id, idemploye, idvehicule;
    Date datedepart, datearrivee;
    Time heuredepart, heurearrivee;
    String lieu, motif;
    double montantcarburant, quantitecarburant, moyennekilometrage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdemploye() {
        return idemploye;
    }

    public void setIdemploye(int idemploye) {
        this.idemploye = idemploye;
    }

    public int getIdvehicule() {
        return idvehicule;
    }

    public void setIdvehicule(int idvehicule) {
        this.idvehicule = idvehicule;
    }

    public Date getDatedepart() {
        return datedepart;
    }

    public void setDatedepart(Date datedepart) {
        this.datedepart = datedepart;
    }

    public Date getDatearrivee() {
        return datearrivee;
    }

    public void setDatearrivee(Date datearrivee) {
        this.datearrivee = datearrivee;
    }

    public Time getHeuredepart() {
        return heuredepart;
    }

    public void setHeuredepart(Time heuredepart) {
        this.heuredepart = heuredepart;
    }

    public Time getHeurearrivee() {
        return heurearrivee;
    }

    public void setHeurearrivee(Time heurearrivee) {
        this.heurearrivee = heurearrivee;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public double getMontantcarburant() {
        return montantcarburant;
    }

    public void setMontantcarburant(double montantcarburant) {
        this.montantcarburant = montantcarburant;
    }

    public double getQuantitecarburant() {
        return quantitecarburant;
    }

    public void setQuantitecarburant(double quantitecarburant) {
        this.quantitecarburant = quantitecarburant;
    }

    public double getMoyennekilometrage() {
        return moyennekilometrage;
    }

    public void setMoyennekilometrage(double moyennekilometrage) {
        this.moyennekilometrage = moyennekilometrage;
    }

    public void insertTrajet(FonctionGeneralise f,Trajet t) throws Exception{
        f.insert(t);
    }
}

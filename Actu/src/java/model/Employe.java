/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Kanto
 */
public class Employe {

    int id, idprofil, idgenre;
    String numemploye, nomemploye, adresse, contact, mdp,prenomemploye;

    public String getPrenomemploye() {
        return prenomemploye;
    }

    public void setPrenomemploye(String prenomemploye) {
        this.prenomemploye = prenomemploye;
    }
    Date datenaissance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdprofil() {
        return idprofil;
    }

    public void setIdprofil(int idprofil) {
        this.idprofil = idprofil;
    }

    public int getIdgenre() {
        return idgenre;
    }

    public void setIdgenre(int idgenre) {
        this.idgenre = idgenre;
    }

    public String getNumemploye() {
        return numemploye;
    }

    public void setNumemploye(String numemploye) {
        this.numemploye = numemploye;
    }

    public String getNomemploye() {
        return nomemploye;
    }

    public void setNomemploye(String nomemploye) {
        this.nomemploye = nomemploye;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

}

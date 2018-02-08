package com.adneom.tp.beans;

public class Client {
    private String nom;
    private String prenom;
    private String telephone;
    private String mail;
    private String adresse;

    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String getTelephone() {
        return this.telephone;
    }
    public String getMail() {
        return this.mail;
    }
    public String getAdresse() {
        return this.adresse;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
